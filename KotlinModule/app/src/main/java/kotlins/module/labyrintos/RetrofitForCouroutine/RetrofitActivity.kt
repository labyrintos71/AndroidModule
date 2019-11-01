package kotlins.module.labyrintos.RetrofitForCouroutine

import android.os.Bundle
import kotlins.module.labyrintos.CoroutineModule.CoroutineScopeActivity
import kotlins.module.labyrintos.R
import kotlins.module.labyrintos.Retrofit.CoroutineService
import kotlins.module.labyrintos.Retrofit.RetrofitCreator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

/**
 * Created by Labyrintos on 2019-11-01
 */
class RetrofitActivity :CoroutineScopeActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()
    }
    fun getData() = launch {
        val data = async(Dispatchers.IO) {
            RetrofitCreator.create(CoroutineService::class.java).getUser(1)
        }
        //text.text = data.await().data.id.toString()
    }
}
