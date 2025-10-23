package J1;

import com.boxhdo.android.data.model.response.FilterResponse;
import com.boxhdo.domain.model.Filter;
import java.util.List;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class h implements l {
    public final List a(List list) {
        return AbstractC0958a.x(this, list);
    }

    @Override // J1.l
    public final Object s(Object obj) {
        FilterResponse filterResponse = (FilterResponse) obj;
        M5.g.f(filterResponse, "dto");
        String str = "";
        String str2 = filterResponse.f7510a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = filterResponse.f7511b;
        if (str3 != null) {
            str = str3;
        }
        return new Filter(str2, str);
    }
}
