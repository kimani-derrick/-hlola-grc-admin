package H;

import com.google.android.gms.internal.measurement.K1;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class g implements J.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f786a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f787b;

    public /* synthetic */ g(int i7, Object obj) {
        this.f786a = i7;
        this.f787b = obj;
    }

    @Override // J.a
    public final void b(Object obj) {
        h hVar = (h) obj;
        switch (this.f786a) {
            case 0:
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((K1) this.f787b).H(hVar);
                return;
            default:
                synchronized (i.f792c) {
                    try {
                        o.j jVar = i.d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f787b);
                        if (arrayList != null) {
                            jVar.remove((String) this.f787b);
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                ((J.a) arrayList.get(i7)).b(hVar);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
