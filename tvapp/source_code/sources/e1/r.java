package e1;

import com.boxhdo.android.data.model.request.trakt.TraktDeviceRequest;
import com.boxhdo.android.data.model.request.trakt.TraktLoginDeviceRequest;
import com.boxhdo.android.data.model.request.trakt.TraktLogoutRequest;
import com.boxhdo.android.data.model.request.trakt.TraktWatchlistRequest;
import com.boxhdo.android.data.model.response.trakt.TraktDeviceCodeResponse;
import com.boxhdo.android.data.model.response.trakt.TraktLoginResponse;
import com.boxhdo.android.data.model.response.trakt.TraktProfileResponse;
import com.boxhdo.android.data.model.response.trakt.TraktResponseItem;
import java.util.List;
import x6.N;
import z5.C1530l;
import z6.t;
/* loaded from: classes.dex */
public interface r {
    @z6.o("oauth/device/code")
    Object a(@z6.a TraktDeviceRequest traktDeviceRequest, D5.d<? super TraktDeviceCodeResponse> dVar);

    @z6.f("/users/me?extended=full")
    @z6.k({"IncludeAuthorization: true"})
    Object b(D5.d<? super TraktProfileResponse> dVar);

    @z6.k({"IncludeAuthorization: true"})
    @z6.o("/sync/watchlist")
    Object c(@z6.a TraktWatchlistRequest traktWatchlistRequest, D5.d<? super N<C1530l>> dVar);

    @z6.o("oauth/revoke")
    Object d(@z6.a TraktLogoutRequest traktLogoutRequest, D5.d<? super N<C1530l>> dVar);

    @z6.k({"IncludeAuthorization: true"})
    @z6.o("/sync/watchlist/remove")
    Object e(@z6.a TraktWatchlistRequest traktWatchlistRequest, D5.d<? super N<C1530l>> dVar);

    @z6.f("/sync/watchlist")
    @z6.k({"IncludeAuthorization: true"})
    Object f(D5.d<? super List<TraktResponseItem>> dVar);

    @z6.o("/oauth/device/token")
    Object g(@z6.a TraktLoginDeviceRequest traktLoginDeviceRequest, D5.d<? super TraktLoginResponse> dVar);

    @z6.f("/sync/watchlist")
    @z6.k({"IncludeAuthorization: true"})
    Object h(@t("page") int i7, @t("limit") int i8, D5.d<? super List<TraktResponseItem>> dVar);
}
