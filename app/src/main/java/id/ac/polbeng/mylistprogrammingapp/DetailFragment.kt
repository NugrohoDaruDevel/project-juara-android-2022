package id.ac.polbeng.mylistprogrammingapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import id.ac.polbeng.mylistprogrammingapp.databinding.FragmentDetailBinding
import id.ac.polbeng.mylistprogrammingapp.model.Programming
import id.ac.polbeng.mylistprogrammingapp.viewmodel.ProgrammingViewModel

class DetailFragment : Fragment() {

    private val args:DetailFragmentArgs by navArgs()
    private val viewModel : ProgrammingViewModel by activityViewModels()
    private lateinit var binding : FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindProgramming(viewModel.getItemProgramming(args.name))
    }

    private fun bindProgramming(item :Programming){
        binding.apply {
            tvDetailItemName.text =  item.name
            imgDetailDetailLogo.setImageResource(item.logo)
            tvDetailDetail.text = item.detail
            btnWikipedia.setOnClickListener {
                val bukaBrowser = Intent(Intent.ACTION_VIEW)
                bukaBrowser.data = Uri.parse(item.wiki)
                startActivity(bukaBrowser)
            }
            btnShare.setOnClickListener {
                share(item)
            }
        }
    }

    private fun share(programming: Programming){
        val s = programming.wiki
        val intent = Intent(Intent.ACTION_SEND)
            .setType("text/plain")
            .putExtra(Intent.EXTRA_TEXT, s)
        if (activity?.packageManager?.resolveActivity(intent,0) != null){
            startActivity(intent)
        }
    }
}