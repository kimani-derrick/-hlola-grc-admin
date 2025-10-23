package J1;

import com.boxhdo.android.data.model.response.GenreResponse;
import com.boxhdo.domain.model.Genre;
/* loaded from: classes.dex */
public final class i implements l {
    @Override // J1.l
    public final Object s(Object obj) {
        String str;
        String str2;
        boolean z7;
        GenreResponse genreResponse = (GenreResponse) obj;
        M5.g.f(genreResponse, "dto");
        String str3 = genreResponse.f7520b;
        if (str3 == null) {
            str = "";
        } else {
            str = str3;
        }
        String str4 = genreResponse.f7521c;
        if (str4 == null) {
            str2 = "";
        } else {
            str2 = str4;
        }
        Integer num = genreResponse.d;
        if (num != null && num.intValue() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new Genre(genreResponse.f7519a, str, str2, z7);
    }
}
