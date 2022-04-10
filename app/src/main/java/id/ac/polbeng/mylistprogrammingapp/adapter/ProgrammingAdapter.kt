package id.ac.polbeng.mylistprogrammingapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import id.ac.polbeng.mylistprogrammingapp.ListFragmentDirections
import id.ac.polbeng.mylistprogrammingapp.databinding.ItemRowProgrammingBinding
import id.ac.polbeng.mylistprogrammingapp.model.Programming

class ProgrammingAdapter(
    private val listProgrmming: List<Programming>,
    private val clickListener: (Programming) -> Unit
) : RecyclerView.Adapter<ProgrammingAdapter.ListViewHolder>() {

    class ListViewHolder(private var binding: ItemRowProgrammingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(programming: Programming) {
            binding.imgItemLogo.setImageResource(programming.logo)
            binding.tvItemName.text = programming.name + " Programming"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        /**
         * Jika menggunakan return yang dikomen dibawah ini, cardview di recycler view
         * tidak dapat match_paret dengan root tampilannya
         */
        //return ListViewHolder(ItemRowProgrammingBinding.inflate(LayoutInflater.from(parent.context)))
        return ListViewHolder(
            ItemRowProgrammingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ) // agar card dapat match_parent dengan tampilan
        )
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val programming = listProgrmming[position]
        holder.itemView.setOnClickListener {
            val action =
                ListFragmentDirections.actionListFragmentToDetailFragment(name = programming.name)
            Navigation.findNavController(it).navigate(action)
            clickListener(programming)
        }
        holder.bind(programming)
    }

    override fun getItemCount(): Int {
        return listProgrmming.size
    }
}