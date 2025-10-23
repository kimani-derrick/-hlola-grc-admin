package J1;

import com.boxhdo.android.data.model.response.NetworkResponse;
import com.boxhdo.domain.model.Network;
/* loaded from: classes.dex */
public final class n implements l {
    @Override // J1.l
    public final Object s(Object obj) {
        String str;
        NetworkResponse networkResponse = (NetworkResponse) obj;
        M5.g.f(networkResponse, "dto");
        String str2 = "";
        String str3 = networkResponse.f7612b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = networkResponse.f7613c;
        if (str4 != null) {
            str = U5.n.Z(str4, "{width}", "500");
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str;
        }
        return new Network(networkResponse.f7611a, str3, str2);
    }
}
