package kotlins.module.labyrintos.reee

import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

/**
 * Created by Labyrintos on 2019-10-27
 */
class GithubApi {

    interface GithubApiImpl {
      //  @GET("/search/repositories")
      //  fun getRepoList(@Query("q") query: String): Observable<GithubResponseModel>
    }

    companion object {
     //   fun getRepoList(query: String): Observable<GithubResponseModel> {
     //       return RetrofitCreator.create(GithubApiImpl::class.java).getRepoList(query)
     //   }
    }
}