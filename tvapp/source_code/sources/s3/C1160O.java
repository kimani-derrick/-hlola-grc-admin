package s3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0447k2;
import com.google.android.gms.internal.measurement.AbstractC0452l2;
import com.google.android.gms.internal.measurement.C0396a1;
import com.google.android.gms.internal.measurement.C0406c1;
import com.google.android.gms.internal.measurement.C0409d;
import com.google.android.gms.internal.measurement.C0411d1;
import com.google.android.gms.internal.measurement.C0416e1;
import com.google.android.gms.internal.measurement.C0422f2;
import com.google.android.gms.internal.measurement.C0426g1;
import com.google.android.gms.internal.measurement.C0431h1;
import com.google.android.gms.internal.measurement.C0446k1;
import com.google.android.gms.internal.measurement.C0451l1;
import com.google.android.gms.internal.measurement.C0456m1;
import com.google.android.gms.internal.measurement.C0471p1;
import com.google.android.gms.internal.measurement.C0480r1;
import com.google.android.gms.internal.measurement.C0490t1;
import com.google.android.gms.internal.measurement.G1;
import com.google.android.gms.internal.measurement.InterfaceC0481r2;
import com.google.android.gms.internal.measurement.InterfaceC0486s2;
import com.google.android.gms.internal.measurement.O1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.j4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import r0.AbstractC1111a;
/* renamed from: s3.O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160O extends o1 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f13846t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1160O(q1 q1Var, int i7) {
        super(q1Var);
        this.f13846t = i7;
    }

    public static int K(C0451l1 c0451l1, String str) {
        for (int i7 = 0; i7 < ((C0456m1) c0451l1.f8609r).q1(); i7++) {
            if (str.equals(((C0456m1) c0451l1.f8609r).e0(i7).E())) {
                return i7;
            }
        }
        return -1;
    }

    public static Bundle M(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0431h1 c0431h1 = (C0431h1) it.next();
            String G6 = c0431h1.G();
            if (c0431h1.J()) {
                bundle.putDouble(G6, c0431h1.r());
            } else if (c0431h1.K()) {
                bundle.putFloat(G6, c0431h1.y());
            } else if (c0431h1.N()) {
                bundle.putString(G6, c0431h1.H());
            } else if (c0431h1.L()) {
                bundle.putLong(G6, c0431h1.D());
            }
        }
        return bundle;
    }

    public static Bundle N(Map map, boolean z7) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z7) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj2 = arrayList.get(i7);
                        i7++;
                        arrayList2.add(N((Map) obj2, false));
                    }
                    bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                str = obj.toString();
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    public static C0431h1 P(C0416e1 c0416e1, String str) {
        for (C0431h1 c0431h1 : c0416e1.G()) {
            if (c0431h1.G().equals(str)) {
                return c0431h1;
            }
        }
        return null;
    }

    public static AbstractC0452l2 Q(AbstractC0452l2 abstractC0452l2, byte[] bArr) {
        C0422f2 c0422f2;
        C0422f2 c0422f22 = C0422f2.f8556a;
        if (c0422f22 == null) {
            synchronized (C0422f2.class) {
                try {
                    c0422f2 = C0422f2.f8556a;
                    if (c0422f2 == null) {
                        c0422f2 = AbstractC0447k2.c();
                        C0422f2.f8556a = c0422f2;
                    }
                } finally {
                }
            }
            c0422f22 = c0422f2;
        }
        abstractC0452l2.getClass();
        if (c0422f22 != null) {
            abstractC0452l2.g(bArr, bArr.length, c0422f22);
            return abstractC0452l2;
        }
        abstractC0452l2.g(bArr, bArr.length, C0422f2.f8557b);
        return abstractC0452l2;
    }

    public static String S(boolean z7, boolean z8, boolean z9) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("Dynamic ");
        }
        if (z8) {
            sb.append("Sequence ");
        }
        if (z9) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static ArrayList T(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j7 = 0;
            for (int i8 = 0; i8 < 64; i8++) {
                int i9 = (i7 << 6) + i8;
                if (i9 < bitSet.length()) {
                    if (bitSet.get(i9)) {
                        j7 |= 1 << i8;
                    }
                }
            }
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(U((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        r5.add(U((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r5.add(U((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap U(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = U(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = U(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = U(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1160O.U(android.os.Bundle, boolean):java.util.HashMap");
    }

    public static C1201u W(C0409d c0409d) {
        String str;
        Object obj;
        Bundle N6 = N(c0409d.f8534c, true);
        if (N6.containsKey("_o") && (obj = N6.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String c5 = AbstractC1204v0.c(c0409d.f8532a, AbstractC1204v0.f14359a, AbstractC1204v0.f14361c);
        if (c5 == null) {
            c5 = c0409d.f8532a;
        }
        return new C1201u(c5, new r(N6), str2, c0409d.f8533b);
    }

    public static void Y(int i7, StringBuilder sb) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
    }

    public static void Z(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static void a0(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                Z(builder, str3, string, set);
            }
        }
    }

    public static void b0(C0411d1 c0411d1, String str, Long l7) {
        List p3 = c0411d1.p();
        int i7 = 0;
        while (true) {
            if (i7 < p3.size()) {
                if (str.equals(((C0431h1) p3.get(i7)).G())) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        C0426g1 F = C0431h1.F();
        F.k(str);
        if (l7 instanceof Long) {
            F.i(l7.longValue());
        } else if (l7 instanceof String) {
            F.l((String) l7);
        } else if (l7 instanceof Double) {
            double doubleValue = ((Double) l7).doubleValue();
            F.e();
            C0431h1.s((C0431h1) F.f8609r, doubleValue);
        }
        if (i7 >= 0) {
            c0411d1.e();
            C0416e1.w((C0416e1) c0411d1.f8609r, i7, (C0431h1) F.c());
            return;
        }
        c0411d1.i(F);
    }

    public static void f0(StringBuilder sb, int i7, String str, com.google.android.gms.internal.measurement.C0 c02) {
        if (c02 == null) {
            return;
        }
        Y(i7, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c02.x()) {
            g0(sb, i7, "comparison_type", AbstractC1111a.z(c02.r()));
        }
        if (c02.z()) {
            g0(sb, i7, "match_as_float", Boolean.valueOf(c02.w()));
        }
        if (c02.y()) {
            g0(sb, i7, "comparison_value", c02.t());
        }
        if (c02.B()) {
            g0(sb, i7, "min_comparison_value", c02.v());
        }
        if (c02.A()) {
            g0(sb, i7, "max_comparison_value", c02.u());
        }
        Y(i7, sb);
        sb.append("}\n");
    }

    public static void g0(StringBuilder sb, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        Y(i7 + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static void h0(StringBuilder sb, String str, C0471p1 c0471p1) {
        Integer num;
        Integer num2;
        Long l7;
        if (c0471p1 == null) {
            return;
        }
        Y(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c0471p1.u() != 0) {
            Y(4, sb);
            sb.append("results: ");
            int i7 = 0;
            for (Long l8 : c0471p1.G()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i7 = i8;
            }
            sb.append('\n');
        }
        if (c0471p1.A() != 0) {
            Y(4, sb);
            sb.append("status: ");
            int i9 = 0;
            for (Long l9 : c0471p1.I()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(l9);
                i9 = i10;
            }
            sb.append('\n');
        }
        if (c0471p1.r() != 0) {
            Y(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i11 = 0;
            for (C0406c1 c0406c1 : c0471p1.F()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                if (c0406c1.x()) {
                    num2 = Integer.valueOf(c0406c1.r());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (c0406c1.w()) {
                    l7 = Long.valueOf(c0406c1.u());
                } else {
                    l7 = null;
                }
                sb.append(l7);
                i11 = i12;
            }
            sb.append("}\n");
        }
        if (c0471p1.x() != 0) {
            Y(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i13 = 0;
            for (C0480r1 c0480r1 : c0471p1.H()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                if (c0480r1.y()) {
                    num = Integer.valueOf(c0480r1.v());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                int i15 = 0;
                for (Long l10 : c0480r1.x()) {
                    long longValue = l10.longValue();
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i15 = i16;
                }
                sb.append("]");
                i13 = i14;
            }
            sb.append("}\n");
        }
        Y(3, sb);
        sb.append("}\n");
    }

    public static boolean j0(InterfaceC0486s2 interfaceC0486s2, int i7) {
        if (i7 < (interfaceC0486s2.size() << 6)) {
            if (((1 << (i7 % 64)) & ((Long) interfaceC0486s2.get(i7 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static byte[] k0(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable l0(C0416e1 c0416e1, String str) {
        C0431h1 P6 = P(c0416e1, str);
        if (P6 != null) {
            if (P6.N()) {
                return P6.H();
            }
            if (P6.L()) {
                return Long.valueOf(P6.D());
            }
            if (P6.J()) {
                return Double.valueOf(P6.r());
            }
            if (P6.B() > 0) {
                List<C0431h1> I6 = P6.I();
                ArrayList arrayList = new ArrayList();
                for (C0431h1 c0431h1 : I6) {
                    if (c0431h1 != null) {
                        Bundle bundle = new Bundle();
                        for (C0431h1 c0431h12 : c0431h1.I()) {
                            if (c0431h12.N()) {
                                bundle.putString(c0431h12.G(), c0431h12.H());
                            } else if (c0431h12.L()) {
                                bundle.putLong(c0431h12.G(), c0431h12.D());
                            } else if (c0431h12.J()) {
                                bundle.putDouble(c0431h12.G(), c0431h12.r());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public static boolean m0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    @Override // s3.o1
    public final boolean J() {
        switch (this.f13846t) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    public long L(byte[] bArr) {
        g3.n.g(bArr);
        C().D();
        MessageDigest S02 = x1.S0();
        if (S02 == null) {
            b().f13807v.d("Failed to get MD5");
            return 0L;
        }
        return x1.L(S02.digest(bArr));
    }

    public Parcelable O(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (h3.b unused) {
            b().f13807v.d("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public String R(C0446k1 c0446k1) {
        Long l7;
        Long l8;
        Double d;
        com.google.android.gms.internal.measurement.Y0 W12;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        j4.a();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (c1175g0.f14062w.O(null, AbstractC1203v.f14349u0) && c0446k1.r() > 0) {
            C();
            if (x1.I0(c0446k1.s().Z1()) && c0446k1.y()) {
                g0(sb, 0, "UploadSubdomain", c0446k1.w());
            }
        }
        for (C0456m1 c0456m1 : c0446k1.x()) {
            if (c0456m1 != null) {
                Y(1, sb);
                sb.append("bundle {\n");
                if (c0456m1.x0()) {
                    g0(sb, 1, "protocol_version", Integer.valueOf(c0456m1.b1()));
                }
                d4.a();
                String Z12 = c0456m1.Z1();
                C1148C c1148c = AbstractC1203v.f14347t0;
                C1170e c1170e = c1175g0.f14062w;
                if (c1170e.O(Z12, c1148c) && c0456m1.A0()) {
                    g0(sb, 1, "session_stitching_token", c0456m1.Q());
                }
                g0(sb, 1, "platform", c0456m1.O());
                if (c0456m1.s0()) {
                    g0(sb, 1, "gmp_version", Long.valueOf(c0456m1.J1()));
                }
                if (c0456m1.F0()) {
                    g0(sb, 1, "uploading_gmp_version", Long.valueOf(c0456m1.V1()));
                }
                if (c0456m1.q0()) {
                    g0(sb, 1, "dynamite_version", Long.valueOf(c0456m1.D1()));
                }
                if (c0456m1.c0()) {
                    g0(sb, 1, "config_version", Long.valueOf(c0456m1.v1()));
                }
                g0(sb, 1, "gmp_app_id", c0456m1.r());
                g0(sb, 1, "admob_app_id", c0456m1.Y1());
                g0(sb, 1, "app_id", c0456m1.Z1());
                g0(sb, 1, "app_version", c0456m1.F());
                if (c0456m1.Z()) {
                    g0(sb, 1, "app_version_major", Integer.valueOf(c0456m1.d0()));
                }
                g0(sb, 1, "firebase_instance_id", c0456m1.L());
                if (c0456m1.p0()) {
                    g0(sb, 1, "dev_cert_hash", Long.valueOf(c0456m1.z1()));
                }
                g0(sb, 1, "app_store", c0456m1.E());
                if (c0456m1.E0()) {
                    g0(sb, 1, "upload_timestamp_millis", Long.valueOf(c0456m1.T1()));
                }
                if (c0456m1.B0()) {
                    g0(sb, 1, "start_timestamp_millis", Long.valueOf(c0456m1.P1()));
                }
                if (c0456m1.r0()) {
                    g0(sb, 1, "end_timestamp_millis", Long.valueOf(c0456m1.H1()));
                }
                if (c0456m1.w0()) {
                    g0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c0456m1.N1()));
                }
                if (c0456m1.v0()) {
                    g0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c0456m1.L1()));
                }
                g0(sb, 1, "app_instance_id", c0456m1.a2());
                g0(sb, 1, "resettable_device_id", c0456m1.P());
                g0(sb, 1, "ds_id", c0456m1.K());
                if (c0456m1.u0()) {
                    g0(sb, 1, "limited_ad_tracking", Boolean.valueOf(c0456m1.X()));
                }
                g0(sb, 1, "os_version", c0456m1.N());
                g0(sb, 1, "device_model", c0456m1.J());
                g0(sb, 1, "user_default_language", c0456m1.R());
                if (c0456m1.D0()) {
                    g0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c0456m1.l1()));
                }
                if (c0456m1.b0()) {
                    g0(sb, 1, "bundle_sequential_index", Integer.valueOf(c0456m1.G0()));
                }
                j4.a();
                C();
                if (x1.I0(c0456m1.Z1()) && c1170e.O(null, AbstractC1203v.f14349u0) && c0456m1.o0()) {
                    g0(sb, 1, "delivery_index", Integer.valueOf(c0456m1.P0()));
                }
                if (c0456m1.z0()) {
                    g0(sb, 1, "service_upload", Boolean.valueOf(c0456m1.Y()));
                }
                g0(sb, 1, "health_monitor", c0456m1.M());
                if (c0456m1.y0()) {
                    g0(sb, 1, "retry_counter", Integer.valueOf(c0456m1.g1()));
                }
                if (c0456m1.m0()) {
                    g0(sb, 1, "consent_signals", c0456m1.H());
                }
                if (c0456m1.t0()) {
                    g0(sb, 1, "is_dma_region", Boolean.valueOf(c0456m1.W()));
                }
                if (c0456m1.n0()) {
                    g0(sb, 1, "core_platform_services", c0456m1.I());
                }
                if (c0456m1.l0()) {
                    g0(sb, 1, "consent_diagnostics", c0456m1.G());
                }
                if (c0456m1.C0()) {
                    g0(sb, 1, "target_os_version", Long.valueOf(c0456m1.R1()));
                }
                Y3.a();
                if (c1170e.O(c0456m1.Z1(), AbstractC1203v.f14263B0)) {
                    g0(sb, 1, "ad_services_version", Integer.valueOf(c0456m1.s()));
                    if (c0456m1.a0() && (W12 = c0456m1.W1()) != null) {
                        Y(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        g0(sb, 2, "eligible", Boolean.valueOf(W12.B()));
                        g0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(W12.E()));
                        g0(sb, 2, "pre_r", Boolean.valueOf(W12.F()));
                        g0(sb, 2, "r_extensions_too_old", Boolean.valueOf(W12.G()));
                        g0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(W12.z()));
                        g0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(W12.x()));
                        g0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(W12.D()));
                        Y(2, sb);
                        sb.append("}\n");
                    }
                }
                InterfaceC0481r2<C0490t1> U6 = c0456m1.U();
                C1153H c1153h = c1175g0.f14036C;
                if (U6 != null) {
                    for (C0490t1 c0490t1 : U6) {
                        if (c0490t1 != null) {
                            Y(2, sb);
                            sb.append("user_property {\n");
                            if (c0490t1.J()) {
                                l7 = Long.valueOf(c0490t1.C());
                            } else {
                                l7 = null;
                            }
                            g0(sb, 2, "set_timestamp_millis", l7);
                            g0(sb, 2, "name", c1153h.g(c0490t1.E()));
                            g0(sb, 2, "string_value", c0490t1.F());
                            if (c0490t1.I()) {
                                l8 = Long.valueOf(c0490t1.A());
                            } else {
                                l8 = null;
                            }
                            g0(sb, 2, "int_value", l8);
                            if (c0490t1.G()) {
                                d = Double.valueOf(c0490t1.r());
                            } else {
                                d = null;
                            }
                            g0(sb, 2, "double_value", d);
                            Y(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC0481r2<C0396a1> S6 = c0456m1.S();
                if (S6 != null) {
                    for (C0396a1 c0396a1 : S6) {
                        if (c0396a1 != null) {
                            Y(2, sb);
                            sb.append("audience_membership {\n");
                            if (c0396a1.A()) {
                                g0(sb, 2, "audience_id", Integer.valueOf(c0396a1.r()));
                            }
                            if (c0396a1.B()) {
                                g0(sb, 2, "new_audience", Boolean.valueOf(c0396a1.z()));
                            }
                            h0(sb, "current_data", c0396a1.x());
                            if (c0396a1.C()) {
                                h0(sb, "previous_data", c0396a1.y());
                            }
                            Y(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC0481r2<C0416e1> T6 = c0456m1.T();
                if (T6 != null) {
                    for (C0416e1 c0416e1 : T6) {
                        if (c0416e1 != null) {
                            Y(2, sb);
                            sb.append("event {\n");
                            g0(sb, 2, "name", c1153h.b(c0416e1.F()));
                            if (c0416e1.J()) {
                                g0(sb, 2, "timestamp_millis", Long.valueOf(c0416e1.D()));
                            }
                            if (c0416e1.I()) {
                                g0(sb, 2, "previous_timestamp_millis", Long.valueOf(c0416e1.C()));
                            }
                            if (c0416e1.H()) {
                                g0(sb, 2, "count", Integer.valueOf(c0416e1.r()));
                            }
                            if (c0416e1.A() != 0) {
                                e0(sb, 2, c0416e1.G());
                            }
                            Y(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                Y(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public List V(InterfaceC0486s2 interfaceC0486s2, List list) {
        int i7;
        ArrayList arrayList = new ArrayList(interfaceC0486s2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                b().f13810y.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    b().f13810y.b(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i8 = size2;
            i7 = size;
            size = i8;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    public j1 X(String str, C0451l1 c0451l1, C0411d1 c0411d1, String str2) {
        String K6;
        String valueOf;
        String valueOf2;
        int indexOf;
        Y3.a();
        C1175g0 c1175g0 = (C1175g0) this.f2765q;
        if (!c1175g0.f14062w.O(str, AbstractC1203v.f14263B0)) {
            return null;
        }
        c1175g0.f14037D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C1148C c1148c = AbstractC1203v.f14320f0;
        C1170e c1170e = c1175g0.f14062w;
        String[] split = c1170e.K(str, c1148c).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        n1 n1Var = this.f14116r.f14214z;
        Z G6 = n1Var.G();
        G6.D();
        G6.b0(str);
        String str4 = (String) G6.f13942B.get(str);
        Uri.Builder builder = new Uri.Builder();
        C1175g0 c1175g02 = (C1175g0) n1Var.f2765q;
        builder.scheme(c1175g02.f14062w.K(str, AbstractC1203v.f14304Y));
        boolean isEmpty = TextUtils.isEmpty(str4);
        C1170e c1170e2 = c1175g02.f14062w;
        if (!isEmpty) {
            K6 = str4 + "." + c1170e2.K(str, AbstractC1203v.f14306Z);
        } else {
            K6 = c1170e2.K(str, AbstractC1203v.f14306Z);
        }
        builder.authority(K6);
        builder.path(c1170e2.K(str, AbstractC1203v.f14309a0));
        Z(builder, "gmp_app_id", ((C0456m1) c0451l1.f8609r).r(), unmodifiableSet);
        Z(builder, "gmp_version", "95001", unmodifiableSet);
        String a22 = ((C0456m1) c0451l1.f8609r).a2();
        C1148C c1148c2 = AbstractC1203v.f14269E0;
        if (c1170e.O(str, c1148c2) && G().Z(str)) {
            a22 = "";
        }
        Z(builder, "app_instance_id", a22, unmodifiableSet);
        Z(builder, "rdid", ((C0456m1) c0451l1.f8609r).P(), unmodifiableSet);
        Z(builder, "bundle_id", c0451l1.y(), unmodifiableSet);
        String o7 = c0411d1.o();
        String c5 = AbstractC1204v0.c(o7, AbstractC1204v0.f14361c, AbstractC1204v0.f14359a);
        if (!TextUtils.isEmpty(c5)) {
            o7 = c5;
        }
        Z(builder, "app_event_name", o7, unmodifiableSet);
        Z(builder, "app_version", String.valueOf(((C0456m1) c0451l1.f8609r).d0()), unmodifiableSet);
        String N6 = ((C0456m1) c0451l1.f8609r).N();
        if (c1170e.O(str, c1148c2) && G().a0(str) && !TextUtils.isEmpty(N6) && (indexOf = N6.indexOf(".")) != -1) {
            N6 = N6.substring(0, indexOf);
        }
        Z(builder, "os_version", N6, unmodifiableSet);
        Z(builder, "timestamp", String.valueOf(c0411d1.n()), unmodifiableSet);
        String str5 = "1";
        if (((C0456m1) c0451l1.f8609r).X()) {
            Z(builder, "lat", "1", unmodifiableSet);
        }
        Z(builder, "privacy_sandbox_version", String.valueOf(((C0456m1) c0451l1.f8609r).s()), unmodifiableSet);
        Z(builder, "trigger_uri_source", "1", unmodifiableSet);
        Z(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        Z(builder, "request_uuid", str2, unmodifiableSet);
        List<C0431h1> p3 = c0411d1.p();
        Bundle bundle = new Bundle();
        for (C0431h1 c0431h1 : p3) {
            String G7 = c0431h1.G();
            if (c0431h1.J()) {
                valueOf2 = String.valueOf(c0431h1.r());
            } else if (c0431h1.K()) {
                valueOf2 = String.valueOf(c0431h1.y());
            } else if (c0431h1.N()) {
                valueOf2 = c0431h1.H();
            } else if (c0431h1.L()) {
                valueOf2 = String.valueOf(c0431h1.D());
            }
            bundle.putString(G7, valueOf2);
        }
        a0(builder, c1170e.K(str, AbstractC1203v.f14319e0).split("\\|"), bundle, unmodifiableSet);
        List<C0490t1> unmodifiableList = Collections.unmodifiableList(((C0456m1) c0451l1.f8609r).U());
        Bundle bundle2 = new Bundle();
        for (C0490t1 c0490t1 : unmodifiableList) {
            String E4 = c0490t1.E();
            if (c0490t1.G()) {
                valueOf = String.valueOf(c0490t1.r());
            } else if (c0490t1.H()) {
                valueOf = String.valueOf(c0490t1.w());
            } else if (c0490t1.K()) {
                valueOf = c0490t1.F();
            } else if (c0490t1.I()) {
                valueOf = String.valueOf(c0490t1.A());
            }
            bundle2.putString(E4, valueOf);
        }
        a0(builder, c1170e.K(str, AbstractC1203v.f14317d0).split("\\|"), bundle2, unmodifiableSet);
        if (!((C0456m1) c0451l1.f8609r).W()) {
            str5 = "0";
        }
        Z(builder, "dma", str5, unmodifiableSet);
        if (!((C0456m1) c0451l1.f8609r).I().isEmpty()) {
            Z(builder, "dma_cps", ((C0456m1) c0451l1.f8609r).I(), unmodifiableSet);
        }
        return new j1(1, currentTimeMillis, builder.build().toString());
    }

    public void c0(C0426g1 c0426g1, Object obj) {
        Bundle[] bundleArr;
        c0426g1.e();
        C0431h1.x((C0431h1) c0426g1.f8609r);
        c0426g1.e();
        C0431h1.z((C0431h1) c0426g1.f8609r);
        c0426g1.e();
        C0431h1.C((C0431h1) c0426g1.f8609r);
        c0426g1.e();
        C0431h1.E((C0431h1) c0426g1.f8609r);
        if (obj instanceof String) {
            c0426g1.l((String) obj);
        } else if (obj instanceof Long) {
            c0426g1.i(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            c0426g1.e();
            C0431h1.s((C0431h1) c0426g1.f8609r, doubleValue);
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C0426g1 F = C0431h1.F();
                    for (String str : bundle.keySet()) {
                        C0426g1 F4 = C0431h1.F();
                        F4.k(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            F4.i(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            F4.l((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            F4.e();
                            C0431h1.s((C0431h1) F4.f8609r, doubleValue2);
                        }
                        F.e();
                        C0431h1.u((C0431h1) F.f8609r, (C0431h1) F4.c());
                    }
                    if (((C0431h1) F.f8609r).B() > 0) {
                        arrayList.add((C0431h1) F.c());
                    }
                }
            }
            c0426g1.e();
            C0431h1.w((C0431h1) c0426g1.f8609r, arrayList);
        } else {
            b().f13807v.c(obj, "Ignoring invalid (type) event param value");
        }
    }

    public void d0(StringBuilder sb, int i7, com.google.android.gms.internal.measurement.A0 a02) {
        if (a02 == null) {
            return;
        }
        Y(i7, sb);
        sb.append("filter {\n");
        if (a02.x()) {
            g0(sb, i7, "complement", Boolean.valueOf(a02.w()));
        }
        if (a02.z()) {
            g0(sb, i7, "param_name", ((C1175g0) this.f2765q).f14036C.f(a02.v()));
        }
        if (a02.A()) {
            int i8 = i7 + 1;
            com.google.android.gms.internal.measurement.F0 u7 = a02.u();
            if (u7 != null) {
                Y(i8, sb);
                sb.append("string_filter");
                sb.append(" {\n");
                if (u7.z()) {
                    g0(sb, i8, "match_type", AbstractC1111a.A(u7.s()));
                }
                if (u7.y()) {
                    g0(sb, i8, "expression", u7.u());
                }
                if (u7.x()) {
                    g0(sb, i8, "case_sensitive", Boolean.valueOf(u7.w()));
                }
                if (u7.r() > 0) {
                    Y(i7 + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str : u7.v()) {
                        Y(i7 + 3, sb);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                Y(i8, sb);
                sb.append("}\n");
            }
        }
        if (a02.y()) {
            f0(sb, i7 + 1, "number_filter", a02.t());
        }
        Y(i7, sb);
        sb.append("}\n");
    }

    public void e0(StringBuilder sb, int i7, InterfaceC0481r2 interfaceC0481r2) {
        String str;
        String str2;
        Long l7;
        if (interfaceC0481r2 == null) {
            return;
        }
        int i8 = i7 + 1;
        Iterator it = interfaceC0481r2.iterator();
        while (it.hasNext()) {
            C0431h1 c0431h1 = (C0431h1) it.next();
            if (c0431h1 != null) {
                Y(i8, sb);
                sb.append("param {\n");
                Double d = null;
                if (c0431h1.M()) {
                    str = ((C1175g0) this.f2765q).f14036C.f(c0431h1.G());
                } else {
                    str = null;
                }
                g0(sb, i8, "name", str);
                if (c0431h1.N()) {
                    str2 = c0431h1.H();
                } else {
                    str2 = null;
                }
                g0(sb, i8, "string_value", str2);
                if (c0431h1.L()) {
                    l7 = Long.valueOf(c0431h1.D());
                } else {
                    l7 = null;
                }
                g0(sb, i8, "int_value", l7);
                if (c0431h1.J()) {
                    d = Double.valueOf(c0431h1.r());
                }
                g0(sb, i8, "double_value", d);
                if (c0431h1.B() > 0) {
                    e0(sb, i8, (InterfaceC0481r2) c0431h1.I());
                }
                Y(i8, sb);
                sb.append("}\n");
            }
        }
    }

    public boolean i0(long j7, long j8) {
        if (j7 != 0 && j8 > 0) {
            ((C1175g0) this.f2765q).f14037D.getClass();
            if (Math.abs(System.currentTimeMillis() - j7) <= j8) {
                return false;
            }
            return true;
        }
        return true;
    }

    public byte[] n0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e3) {
            b().f13807v.c(e3, "Failed to gzip content");
            throw e3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r8.booleanValue() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1160O.o0(java.lang.String):boolean");
    }

    public byte[] p0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e3) {
            b().f13807v.c(e3, "Failed to ungzip content");
            throw e3;
        }
    }

    public ArrayList q0() {
        Map c5;
        Context context = this.f14116r.f14185B.f14056q;
        List list = AbstractC1203v.f14308a;
        G1 a7 = G1.a(context.getContentResolver(), O1.a("com.google.android.gms.measurement"), new androidx.emoji2.text.l(1));
        if (a7 == null) {
            c5 = Collections.emptyMap();
        } else {
            c5 = a7.c();
        }
        if (c5 == null || c5.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) AbstractC1203v.f14290Q.a(null)).intValue();
        for (Map.Entry entry : c5.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            b().f13810y.c(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e3) {
                    b().f13810y.c(e3, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public boolean r0() {
        H();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C1175g0) this.f2765q).f14056q.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
