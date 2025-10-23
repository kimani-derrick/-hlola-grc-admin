package J1;

import com.boxhdo.android.data.model.response.CastResponse;
import com.boxhdo.domain.model.Cast;
/* loaded from: classes.dex */
public final class b implements l {
    @Override // J1.l
    public final Object s(Object obj) {
        String str;
        String str2;
        int i7;
        CastResponse castResponse = (CastResponse) obj;
        M5.g.f(castResponse, "dto");
        String str3 = castResponse.f7416b;
        if (str3 == null) {
            str = "";
        } else {
            str = str3;
        }
        String str4 = castResponse.f7417c;
        if (str4 == null) {
            str4 = "";
        }
        String Z6 = U5.n.Z(str4, "{width}-{height}", "150-150");
        String str5 = castResponse.f7420h;
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5;
        }
        Integer num = castResponse.f7421i;
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        return new Cast(i7, castResponse.f7415a, str, Z6, str2);
    }
}
