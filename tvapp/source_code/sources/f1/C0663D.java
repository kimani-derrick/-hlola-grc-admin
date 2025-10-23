package f1;

import W5.InterfaceC0116x;
import a1.C0197a;
import com.boxhdo.android.data.model.response.trakt.TraktIds;
import com.boxhdo.android.data.model.response.trakt.TraktMovie;
import com.boxhdo.android.data.model.response.trakt.TraktResponseItem;
import com.boxhdo.android.data.model.response.trakt.TraktShow;
import java.util.ArrayList;
import java.util.List;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663D extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10213u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0669J f10214v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0663D(C0669J c0669j, D5.d dVar) {
        super(2, dVar);
        this.f10214v = c0669j;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0663D(this.f10214v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0663D) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Long l7;
        long j7;
        TraktIds traktIds;
        TraktIds traktIds2;
        Long l8;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10213u;
        C0669J c0669j = this.f10214v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f10213u = 1;
            obj = ((e1.r) c0669j.f10229a.get()).f(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) obj;
        C0197a c0197a = c0669j.f10230b;
        List<TraktResponseItem> list2 = list;
        ArrayList arrayList = new ArrayList(A5.m.P(list2));
        for (TraktResponseItem traktResponseItem : list2) {
            TraktMovie traktMovie = traktResponseItem.f7750c;
            if (traktMovie != null && (traktIds2 = traktMovie.f7735a) != null && (l8 = traktIds2.f7724c) != null) {
                j7 = l8.longValue();
            } else {
                TraktShow traktShow = traktResponseItem.f;
                if (traktShow != null && (traktIds = traktShow.f7763a) != null) {
                    l7 = traktIds.f7724c;
                } else {
                    l7 = null;
                }
                if (l7 != null) {
                    j7 = l7.longValue();
                } else {
                    j7 = 0;
                }
            }
            arrayList.add(new Long(j7));
        }
        l0.Q(c0197a, arrayList);
        return new Y0.b(list);
    }
}
