package m3;

import A5.m;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.EnumC0337o;
import com.google.android.gms.internal.measurement.C0408c3;
import com.google.android.gms.internal.measurement.C0418e3;
import com.google.android.gms.internal.measurement.C0492t3;
import com.google.android.gms.internal.measurement.C0502v3;
import com.google.android.gms.internal.measurement.InterfaceC0423f3;
import com.google.android.gms.internal.measurement.InterfaceC0487s3;
import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.T2;
import com.google.android.gms.internal.measurement.U3;
import com.google.android.gms.internal.measurement.V2;
import com.google.android.gms.internal.measurement.V3;
import com.google.android.gms.internal.measurement.W2;
import com.google.android.gms.internal.measurement.X2;
import com.google.android.gms.internal.measurement.Y2;
import com.google.android.gms.internal.measurement.Z2;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.m4;
import com.google.android.gms.internal.measurement.n4;
import h6.A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import n0.C1019j;
import n0.q;
import n0.v;
import s3.InterfaceC1147B;
/* loaded from: classes.dex */
public final class i implements d, InterfaceC1147B {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12431q;

    public /* synthetic */ i(int i7) {
        this.f12431q = i7;
    }

    public static ArrayList b(List list) {
        M5.g.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((A) obj) != A.f11062r) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.P(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((A) it.next()).f11069q);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, v6.f] */
    public static byte[] c(List list) {
        M5.g.f(list, "protocols");
        ?? obj = new Object();
        Iterator it = b(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.i0(str.length());
            obj.o0(str);
        }
        return obj.Y(obj.f15388r);
    }

    public static C1019j d(Context context, v vVar, Bundle bundle, EnumC0337o enumC0337o, q qVar) {
        String uuid = UUID.randomUUID().toString();
        M5.g.e(uuid, "randomUUID().toString()");
        M5.g.f(enumC0337o, "hostLifecycleState");
        return new C1019j(context, vVar, bundle, enumC0337o, qVar, uuid, null);
    }

    public static boolean e() {
        return M5.g.a("Dalvik", System.getProperty("java.vm.name"));
    }

    public static boolean f() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    @Override // s3.InterfaceC1147B
    public Object a() {
        switch (this.f12431q) {
            case 4:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return Integer.valueOf((int) ((Long) X2.f8461P.a()).longValue());
            case 5:
                ((m4) ((n4) k4.f8602r.get())).getClass();
                Boolean bool = (Boolean) m4.f8613a.a();
                bool.getClass();
                return bool;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Y2) ((Z2) W2.f8444r.get())).getClass();
                Boolean bool2 = (Boolean) Y2.f8495b.a();
                bool2.getClass();
                return bool2;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C0502v3) ((InterfaceC0487s3) C0492t3.f8679r.get())).getClass();
                Boolean bool3 = (Boolean) C0502v3.f8703c.a();
                bool3.getClass();
                return bool3;
            case 8:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return Integer.valueOf((int) ((Long) X2.f8457L.a()).longValue());
            case 9:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return Integer.valueOf((int) ((Long) X2.f8479m.a()).longValue());
            case 10:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l7 = (Long) X2.f8452G.a();
                l7.getClass();
                return l7;
            case 11:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l8 = (Long) X2.f8454I.a();
                l8.getClass();
                return l8;
            case 12:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l9 = (Long) X2.f8487v.a();
                l9.getClass();
                return l9;
            case 13:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l10 = (Long) X2.f8473g.a();
                l10.getClass();
                return l10;
            case 14:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l11 = (Long) X2.f8483r.a();
                l11.getClass();
                return l11;
            case 15:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l12 = (Long) X2.f8488w.a();
                l12.getClass();
                return l12;
            case 16:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l13 = (Long) X2.f8466U.a();
                l13.getClass();
                return l13;
            case 17:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l14 = (Long) X2.f8462Q.a();
                l14.getClass();
                return l14;
            case 18:
                ((C0502v3) ((InterfaceC0487s3) C0492t3.f8679r.get())).getClass();
                Boolean bool4 = (Boolean) C0502v3.f8701a.a();
                bool4.getClass();
                return bool4;
            case 19:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return Integer.valueOf((int) ((Long) X2.f8480o.a()).longValue());
            case 20:
                ((U3) ((V3) S3.f8421r.get())).getClass();
                Boolean bool5 = (Boolean) U3.f8436a.a();
                bool5.getClass();
                return bool5;
            case 21:
                ((U3) ((V3) S3.f8421r.get())).getClass();
                Long l15 = (Long) U3.d.a();
                l15.getClass();
                return l15;
            case 22:
                ((U3) ((V3) S3.f8421r.get())).getClass();
                Double d = (Double) U3.f8437b.a();
                d.getClass();
                return d;
            case 23:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return Integer.valueOf((int) ((Long) X2.f8481p.a()).longValue());
            case 24:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l16 = (Long) X2.d.a();
                l16.getClass();
                return l16;
            case 25:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return Integer.valueOf((int) ((Long) X2.f8471c.a()).longValue());
            case 26:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l17 = (Long) X2.F.a();
                l17.getClass();
                return l17;
            case 27:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return Integer.valueOf((int) ((Long) X2.f8477k.a()).longValue());
            case 28:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return (String) X2.f8447A.a();
            default:
                ((C0418e3) ((InterfaceC0423f3) C0408c3.f8530r.get())).getClass();
                Boolean bool6 = (Boolean) C0418e3.f8549b.a();
                bool6.getClass();
                return bool6;
        }
    }

    @Override // m3.d
    public F3.m z(Context context, String str, c cVar) {
        int n;
        F3.m mVar = new F3.m();
        int e3 = cVar.e(context, str);
        mVar.f726a = e3;
        int i7 = 1;
        int i8 = 0;
        if (e3 != 0) {
            n = cVar.n(context, str, false);
        } else {
            n = cVar.n(context, str, true);
        }
        mVar.f727b = n;
        int i9 = mVar.f726a;
        if (i9 == 0) {
            if (n == 0) {
                i7 = 0;
                mVar.f728c = i7;
                return mVar;
            }
        } else {
            i8 = i9;
        }
        if (i8 >= n) {
            i7 = -1;
        }
        mVar.f728c = i7;
        return mVar;
    }
}
