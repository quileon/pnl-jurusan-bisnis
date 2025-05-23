package me.quileon.pnljurusanbisnis

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BeritaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BeritaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardBerita1 = view.findViewById<androidx.cardview.widget.CardView>(R.id.cv_berita_1)
        val cardBerita2 = view.findViewById<androidx.cardview.widget.CardView>(R.id.cv_berita_2)

        cardBerita1.setOnClickListener {
            val intent = Intent(requireContext(), Berita1Activity::class.java)
            startActivity(intent)
        }

        cardBerita2.setOnClickListener {
            val intent = Intent(requireContext(), Berita2Activity::class.java)
            startActivity(intent)
        }

//        val btnSelengkapnya = view.findViewById<androidx.cardview.widget.CardView>(R.id.btn_home_tentang_subtext)
//        btnSelengkapnya.setOnClickListener {
//            val intent = Intent(requireContext(), TentangJurusanActivity::class.java)
//            startActivity(intent)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_berita, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BeritaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BeritaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}