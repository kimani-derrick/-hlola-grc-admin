package e1;

import com.boxhdo.android.data.model.response.AllSettingsResponse;
import com.boxhdo.android.data.model.response.HomeResponse;
import com.boxhdo.android.data.model.response.ListEpisodeResponse;
import com.boxhdo.android.data.model.response.ListSeasonResponse;
import com.boxhdo.android.data.model.response.MovieResponse;
import com.boxhdo.android.data.model.response.PageDataResponse;
import com.boxhdo.android.data.model.response.ResultResponse;
import java.util.List;
import java.util.Map;
import z6.t;
import z6.u;
import z6.y;
/* renamed from: e1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0567a {
    @z6.f
    @z6.k({"IncludeAuthorization: true"})
    Object a(@y String str, @t("movieId") long j7, @t("mediaType") int i7, D5.d<? super ListSeasonResponse> dVar);

    @z6.f
    @z6.k({"IncludeAuthorization: true"})
    Object b(@y String str, @t("movieId") long j7, @t("mediaType") int i7, D5.d<? super ListEpisodeResponse> dVar);

    @z6.f
    Object c(@y String str, @t("page") int i7, @t(encoded = true, value = "genres[]") List<Long> list, @t(encoded = true, value = "limit") int i8, D5.d<? super PageDataResponse<MovieResponse>> dVar);

    @z6.f
    Object d(@y String str, D5.d<? super AllSettingsResponse> dVar);

    @z6.f
    @z6.k({"IncludeAuthorization: true"})
    Object e(@y String str, D5.d<? super MovieResponse> dVar);

    @z6.f
    @z6.k({"IncludeAuthorization: true"})
    Object f(@y String str, D5.d<? super ResultResponse<List<HomeResponse>>> dVar);

    @z6.f
    Object g(@y String str, @u Map<String, String> map, D5.d<? super PageDataResponse<MovieResponse>> dVar);

    @z6.f
    Object h(@y String str, @t("ids[]") List<Long> list, D5.d<? super List<MovieResponse>> dVar);

    @z6.f
    Object i(@y String str, @t("page") int i7, @t("limit") int i8, D5.d<? super PageDataResponse<MovieResponse>> dVar);
}
