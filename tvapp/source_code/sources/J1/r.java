package J1;

import com.boxhdo.android.data.model.response.TabResponse;
import com.boxhdo.domain.model.Tabs;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class r implements l {

    /* renamed from: q  reason: collision with root package name */
    public final m f1316q;

    public r(m mVar) {
        M5.g.f(mVar, "movieMapper");
        this.f1316q = mVar;
    }

    @Override // J1.l
    public final Object s(Object obj) {
        TabResponse tabResponse = (TabResponse) obj;
        M5.g.f(tabResponse, "dto");
        String str = "";
        String str2 = tabResponse.f7674a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = tabResponse.f7675b;
        if (str3 != null) {
            str = str3;
        }
        m mVar = this.f1316q;
        mVar.getClass();
        return new Tabs(str2, str, AbstractC0958a.x(mVar, tabResponse.f7676c));
    }
}
