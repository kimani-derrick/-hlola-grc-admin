package J1;

import com.boxhdo.android.data.model.response.PageDataResponse;
import com.boxhdo.domain.model.PageData;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class o implements l {

    /* renamed from: q  reason: collision with root package name */
    public final l f1313q;

    public o(m mVar) {
        M5.g.f(mVar, "mapper");
        this.f1313q = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [A5.t] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // J1.l
    public final Object s(Object obj) {
        int i7;
        ?? r22;
        PageDataResponse pageDataResponse = (PageDataResponse) obj;
        M5.g.f(pageDataResponse, "dto");
        int i8 = 0;
        Integer num = pageDataResponse.f7617a;
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        Integer num2 = pageDataResponse.f7619c;
        if (num2 != null) {
            i8 = num2.intValue();
        }
        List list = pageDataResponse.f7620e;
        if (list != null) {
            List<Object> list2 = list;
            r22 = new ArrayList(A5.m.P(list2));
            for (Object obj2 : list2) {
                r22.add(this.f1313q.s(obj2));
            }
        } else {
            r22 = 0;
        }
        if (r22 == 0) {
            r22 = A5.t.f135q;
        }
        return new PageData(i7, i8, r22);
    }
}
