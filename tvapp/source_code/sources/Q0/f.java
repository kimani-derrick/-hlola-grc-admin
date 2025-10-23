package Q0;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0503w;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.Q0;
import g3.n;
import o.C1052e;
import s3.Z;
/* loaded from: classes.dex */
public final class f extends o.i {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f2841h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f2842i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i7, K1 k12) {
        super(i7);
        this.f2842i = k12;
    }

    @Override // o.i
    public Object c(Object obj) {
        switch (this.f2841h) {
            case 1:
                String str = (String) obj;
                n.c(str);
                Z z7 = (Z) this.f2842i;
                z7.H();
                n.c(str);
                if (!TextUtils.isEmpty(str)) {
                    C1052e c1052e = z7.f13949x;
                    Q0 q02 = (Q0) c1052e.get(str);
                    if (q02 != null && q02.r() != 0) {
                        if (c1052e.containsKey(str) && c1052e.get(str) != null) {
                            z7.Q(str, (Q0) c1052e.get(str));
                        } else {
                            z7.b0(str);
                        }
                        return (C0503w) z7.f13951z.q().get(str);
                    }
                }
                return null;
            default:
                return super.c(obj);
        }
    }

    @Override // o.i
    public void d(Object obj, Object obj2, Object obj3) {
        switch (this.f2841h) {
            case 0:
                e eVar = (e) obj2;
                e eVar2 = (e) obj3;
                ((i) ((K1) this.f2842i).f8367r).A((b) obj, eVar.f2838a, eVar.f2839b, eVar.f2840c);
                return;
            default:
                super.d(obj, obj2, obj3);
                return;
        }
    }

    @Override // o.i
    public int p(Object obj, Object obj2) {
        switch (this.f2841h) {
            case 0:
                b bVar = (b) obj;
                return ((e) obj2).f2840c;
            default:
                return super.p(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Z z7) {
        super(20);
        this.f2842i = z7;
    }
}
