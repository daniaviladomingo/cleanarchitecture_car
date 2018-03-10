package dani.cleanarchitecture.cars.ui.cars

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import dani.cleanarchitecture.cars.R

class CarsFragment : Fragment(), CarsContract.View {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?)
        = inflater?.inflate(R.layout.fragment_cars, container, false)

    override fun setPresenter(presenter: CarsContract.Presenter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
