package a4;

import H2.C0002c;
import H2.m0;
import O3.C;
import O3.E;
import O3.U;
import O3.Z;
import Z2.AbstractC0156a;
import Z2.B;
import Z2.H;
import Z3.s;
import a3.C0202b;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import e2.A0;
import e2.C0593J;
import e2.C0597b0;
import e2.C0616l;
import e2.E0;
import e2.F0;
import e2.H0;
import e2.I0;
import e2.InterfaceC0602e;
import e2.InterfaceC0604f;
import e2.K;
import e2.K0;
import e2.L;
import e2.M;
import e2.N;
import e2.O;
import e2.P;
import e2.Q;
import e2.T;
import e2.V;
import e2.X;
import e2.Y;
import e2.n0;
import e2.t0;
import e4.C0632b;
import g4.C0736a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import r0.AbstractC1111a;
import w4.l0;
import x2.C1461c;
/* renamed from: a4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0214f implements Z3.b, Z3.n, N3.f, Z2.m, InterfaceC0602e {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f5159q;

    public /* synthetic */ C0214f(int i7) {
        this.f5159q = i7;
    }

    @Override // N3.f
    public Object apply(Object obj) {
        return new f2.f((B) obj);
    }

    @Override // Z2.m
    public void c(Object obj) {
        switch (this.f5159q) {
            case 4:
                ((t0) obj).j(new C0616l(2, new F0.c(1), 1003));
                return;
            case 5:
                ((t0) obj).v();
                return;
            case 25:
                ((f2.k) obj).getClass();
                return;
            case 26:
                ((f2.k) obj).getClass();
                return;
            case 27:
                ((f2.k) obj).getClass();
                return;
            case 28:
                ((f2.k) obj).getClass();
                return;
            default:
                ((f2.k) obj).getClass();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [com.google.android.gms.internal.measurement.S1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [Z5.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [e2.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v217, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v57, types: [boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v39, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v41, types: [boolean[], java.io.Serializable] */
    @Override // e2.InterfaceC0602e
    public InterfaceC0604f e(Bundle bundle) {
        T t5;
        C0597b0 c0597b0;
        P p3;
        V v5;
        boolean z7;
        Z b7;
        Q q5;
        U u7;
        U u8;
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        C0214f c0214f;
        I2.b bVar;
        e2.Z z8;
        e2.U u9 = null;
        T t7 = null;
        byte[] bArr = null;
        M m7 = null;
        byte[] bArr2 = null;
        boolean z9 = true;
        int i7 = 0;
        switch (this.f5159q) {
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                C0593J c0593j = new C0593J();
                if (bundle != null) {
                    ClassLoader classLoader = AbstractC0156a.class.getClassLoader();
                    int i8 = H.f4603a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(K.f9628Z);
                K k5 = K.f9627Y;
                String str = k5.f9676q;
                if (string == null) {
                    string = str;
                }
                c0593j.f9597a = string;
                String string2 = bundle.getString(K.f9629a0);
                if (string2 == null) {
                    string2 = k5.f9677r;
                }
                c0593j.f9598b = string2;
                String string3 = bundle.getString(K.f9630b0);
                if (string3 == null) {
                    string3 = k5.f9678s;
                }
                c0593j.f9599c = string3;
                c0593j.d = bundle.getInt(K.f9631c0, k5.f9679t);
                c0593j.f9600e = bundle.getInt(K.f9632d0, k5.f9680u);
                c0593j.f = bundle.getInt(K.f9633e0, k5.f9681v);
                c0593j.f9601g = bundle.getInt(K.f9634f0, k5.f9682w);
                String string4 = bundle.getString(K.f9635g0);
                if (string4 == null) {
                    string4 = k5.f9684y;
                }
                c0593j.f9602h = string4;
                C1461c c1461c = (C1461c) bundle.getParcelable(K.f9636h0);
                if (c1461c == null) {
                    c1461c = k5.f9685z;
                }
                c0593j.f9603i = c1461c;
                String string5 = bundle.getString(K.f9637i0);
                if (string5 == null) {
                    string5 = k5.f9654A;
                }
                c0593j.f9604j = string5;
                String string6 = bundle.getString(K.f9638j0);
                if (string6 == null) {
                    string6 = k5.f9655B;
                }
                c0593j.f9605k = string6;
                c0593j.f9606l = bundle.getInt(K.f9639k0, k5.f9656C);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(K.f9640l0 + "_" + Integer.toString(i7, 36));
                    if (byteArray == null) {
                        c0593j.f9607m = arrayList;
                        c0593j.n = (j2.i) bundle.getParcelable(K.f9641m0);
                        c0593j.f9608o = bundle.getLong(K.f9642n0, k5.F);
                        c0593j.f9609p = bundle.getInt(K.f9643o0, k5.f9659G);
                        c0593j.f9610q = bundle.getInt(K.f9644p0, k5.f9660H);
                        c0593j.f9611r = bundle.getFloat(K.f9645q0, k5.f9661I);
                        c0593j.f9612s = bundle.getInt(K.f9646r0, k5.f9662J);
                        c0593j.f9613t = bundle.getFloat(K.f9647s0, k5.f9663K);
                        c0593j.f9614u = bundle.getByteArray(K.f9648t0);
                        c0593j.f9615v = bundle.getInt(K.f9649u0, k5.f9665M);
                        Bundle bundle4 = bundle.getBundle(K.f9650v0);
                        if (bundle4 != null) {
                            c0593j.f9616w = (C0202b) C0202b.f5016A.e(bundle4);
                        }
                        c0593j.f9617x = bundle.getInt(K.f9651w0, k5.f9667O);
                        c0593j.f9618y = bundle.getInt(K.f9652x0, k5.f9668P);
                        c0593j.f9619z = bundle.getInt(K.y0, k5.f9669Q);
                        c0593j.f9592A = bundle.getInt(K.f9653z0, k5.f9670R);
                        c0593j.f9593B = bundle.getInt(K.f9621A0, k5.f9671S);
                        c0593j.f9594C = bundle.getInt(K.f9622B0, k5.f9672T);
                        c0593j.f9595D = bundle.getInt(K.f9624D0, k5.f9673U);
                        c0593j.f9596E = bundle.getInt(K.f9625E0, k5.f9674V);
                        c0593j.F = bundle.getInt(K.f9623C0, k5.W);
                        return new K(c0593j);
                    }
                    arrayList.add(byteArray);
                    i7++;
                }
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                if (bundle.getInt(A0.f9418q, -1) != 0) {
                    z9 = false;
                }
                AbstractC0156a.f(z9);
                if (bundle.getBoolean(L.f9695u, false)) {
                    return new L(bundle.getBoolean(L.f9696v, false));
                }
                return new L();
            case 8:
                String string7 = bundle.getString(e2.Z.f9801x, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(e2.Z.f9802y);
                if (bundle5 == null) {
                    t5 = T.f9744v;
                } else {
                    t5 = (T) T.f9743B.e(bundle5);
                }
                T t8 = t5;
                Bundle bundle6 = bundle.getBundle(e2.Z.f9803z);
                if (bundle6 == null) {
                    c0597b0 = C0597b0.f9850Y;
                } else {
                    c0597b0 = (C0597b0) C0597b0.G0.e(bundle6);
                }
                C0597b0 c0597b02 = c0597b0;
                Bundle bundle7 = bundle.getBundle(e2.Z.f9796A);
                if (bundle7 == null) {
                    p3 = P.f9721C;
                } else {
                    p3 = (P) O.f9710B.e(bundle7);
                }
                P p5 = p3;
                Bundle bundle8 = bundle.getBundle(e2.Z.f9797B);
                if (bundle8 == null) {
                    v5 = V.f9769s;
                } else {
                    v5 = (V) V.f9773w.e(bundle8);
                }
                V v7 = v5;
                Bundle bundle9 = bundle.getBundle(e2.Z.f9798C);
                if (bundle9 != null) {
                    u9 = (e2.U) e2.U.F.e(bundle9);
                }
                return new e2.Z(string7, p5, u9, t8, c0597b02, v7);
            case 9:
                Uri uri = (Uri) bundle.getParcelable(M.f9702r);
                uri.getClass();
                ?? obj = new Object();
                obj.f4918q = uri;
                return new M(obj);
            case 10:
                N n = new N();
                P p7 = O.f9711v;
                long j7 = bundle.getLong(O.f9712w, p7.f9716q);
                if (j7 >= 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.f(z7);
                n.f9705a = j7;
                long j8 = bundle.getLong(O.f9713x, p7.f9717r);
                if (j8 != Long.MIN_VALUE && j8 < 0) {
                    z9 = false;
                }
                AbstractC0156a.f(z9);
                n.f9706b = j8;
                n.f9707c = bundle.getBoolean(O.f9714y, p7.f9718s);
                n.d = bundle.getBoolean(O.f9715z, p7.f9719t);
                n.f9708e = bundle.getBoolean(O.f9709A, p7.f9720u);
                return new O(n);
            case 11:
                String string8 = bundle.getString(Q.f9728y);
                string8.getClass();
                UUID fromString = UUID.fromString(string8);
                Uri uri2 = (Uri) bundle.getParcelable(Q.f9729z);
                Bundle bundle10 = Bundle.EMPTY;
                Bundle bundle11 = bundle.getBundle(Q.f9722A);
                if (bundle11 == null) {
                    bundle11 = bundle10;
                }
                Z z10 = Z.f2634w;
                if (bundle11 == bundle10) {
                    b7 = z10;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle11 != bundle10) {
                        for (String str2 : bundle11.keySet()) {
                            String string9 = bundle11.getString(str2);
                            if (string9 != null) {
                                hashMap.put(str2, string9);
                            }
                        }
                    }
                    b7 = Z.b(hashMap);
                }
                boolean z11 = bundle.getBoolean(Q.f9723B, false);
                boolean z12 = bundle.getBoolean(Q.f9724C, false);
                boolean z13 = bundle.getBoolean(Q.f9725D, false);
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Q.f9726E);
                if (integerArrayList != null) {
                    arrayList2 = integerArrayList;
                }
                E s6 = E.s(arrayList2);
                byte[] byteArray2 = bundle.getByteArray(Q.F);
                ?? obj2 = new Object();
                obj2.f8418e = fromString;
                obj2.f = z10;
                obj2.f8419g = U.f2621u;
                obj2.f8415a = uri2;
                obj2.f = Z.b(b7);
                obj2.f8416b = z11;
                obj2.d = z13;
                obj2.f8417c = z12;
                obj2.f8419g = E.s(s6);
                if (byteArray2 != null) {
                    bArr2 = Arrays.copyOf(byteArray2, byteArray2.length);
                }
                obj2.f8420h = bArr2;
                return new Q(obj2);
            case 12:
                return new T(bundle.getLong(T.f9745w, -9223372036854775807L), bundle.getLong(T.f9746x, -9223372036854775807L), bundle.getLong(T.f9747y, -9223372036854775807L), bundle.getFloat(T.f9748z, -3.4028235E38f), bundle.getFloat(T.f9742A, -3.4028235E38f));
            case 13:
                Bundle bundle12 = bundle.getBundle(e2.U.f9754A);
                if (bundle12 == null) {
                    q5 = null;
                } else {
                    q5 = (Q) Q.f9727G.e(bundle12);
                }
                Bundle bundle13 = bundle.getBundle(e2.U.f9755B);
                if (bundle13 != null) {
                    m7 = (M) M.f9703s.e(bundle13);
                }
                M m8 = m7;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(e2.U.f9756C);
                if (parcelableArrayList == null) {
                    C c5 = E.f2597r;
                    u7 = U.f2621u;
                } else {
                    u7 = AbstractC0156a.u(new C0214f(14), parcelableArrayList);
                }
                U u10 = u7;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(e2.U.f9758E);
                if (parcelableArrayList2 == null) {
                    C c6 = E.f2597r;
                    u8 = U.f2621u;
                } else {
                    u8 = AbstractC0156a.u(Y.f9785E, parcelableArrayList2);
                }
                U u11 = u8;
                Uri uri3 = (Uri) bundle.getParcelable(e2.U.f9759y);
                uri3.getClass();
                return new e2.U(uri3, bundle.getString(e2.U.f9760z), q5, m8, u10, bundle.getString(e2.U.f9757D), u11, null);
            case 14:
                return new G2.a(bundle.getInt(G2.a.f742t, 0), bundle.getInt(G2.a.f743u, 0), bundle.getInt(G2.a.f744v, 0));
            case 15:
                C0002c c0002c = new C0002c(26, (byte) 0);
                c0002c.f1017r = (Uri) bundle.getParcelable(V.f9770t);
                c0002c.f1018s = bundle.getString(V.f9771u);
                c0002c.f1019t = bundle.getBundle(V.f9772v);
                return new V(c0002c);
            case 16:
                Uri uri4 = (Uri) bundle.getParcelable(Y.f9786x);
                uri4.getClass();
                String string10 = bundle.getString(Y.f9787y);
                String string11 = bundle.getString(Y.f9788z);
                int i9 = bundle.getInt(Y.f9781A, 0);
                int i10 = bundle.getInt(Y.f9782B, 0);
                String string12 = bundle.getString(Y.f9783C);
                String string13 = bundle.getString(Y.f9784D);
                X x7 = new X(uri4);
                x7.f9776a = string10;
                x7.f9779e = string11;
                x7.f9777b = i9;
                x7.f9778c = i10;
                x7.f = string12;
                x7.f9780g = string13;
                return new Y(x7);
            case 17:
                ?? obj3 = new Object();
                obj3.f9819a = bundle.getCharSequence(C0597b0.f9851Z);
                obj3.f9820b = bundle.getCharSequence(C0597b0.f9852a0);
                obj3.f9821c = bundle.getCharSequence(C0597b0.f9853b0);
                obj3.d = bundle.getCharSequence(C0597b0.f9854c0);
                obj3.f9822e = bundle.getCharSequence(C0597b0.f9855d0);
                obj3.f = bundle.getCharSequence(C0597b0.f9856e0);
                obj3.f9823g = bundle.getCharSequence(C0597b0.f9857f0);
                byte[] byteArray3 = bundle.getByteArray(C0597b0.f9860i0);
                String str3 = C0597b0.f9845B0;
                if (bundle.containsKey(str3)) {
                    num = Integer.valueOf(bundle.getInt(str3));
                } else {
                    num = null;
                }
                if (byteArray3 != null) {
                    bArr = (byte[]) byteArray3.clone();
                }
                obj3.f9826j = bArr;
                obj3.f9827k = num;
                obj3.f9828l = (Uri) bundle.getParcelable(C0597b0.f9861j0);
                obj3.f9839x = bundle.getCharSequence(C0597b0.f9872u0);
                obj3.f9840y = bundle.getCharSequence(C0597b0.f9873v0);
                obj3.f9841z = bundle.getCharSequence(C0597b0.f9874w0);
                obj3.f9815C = bundle.getCharSequence(C0597b0.f9876z0);
                obj3.f9816D = bundle.getCharSequence(C0597b0.f9844A0);
                obj3.f9817E = bundle.getCharSequence(C0597b0.f9846C0);
                obj3.f9818G = bundle.getBundle(C0597b0.f9849F0);
                String str4 = C0597b0.f9858g0;
                if (bundle.containsKey(str4) && (bundle3 = bundle.getBundle(str4)) != null) {
                    obj3.f9824h = (A0) A0.f9419r.e(bundle3);
                }
                String str5 = C0597b0.f9859h0;
                if (bundle.containsKey(str5) && (bundle2 = bundle.getBundle(str5)) != null) {
                    obj3.f9825i = (A0) A0.f9419r.e(bundle2);
                }
                String str6 = C0597b0.f9862k0;
                if (bundle.containsKey(str6)) {
                    obj3.f9829m = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = C0597b0.f9863l0;
                if (bundle.containsKey(str7)) {
                    obj3.n = Integer.valueOf(bundle.getInt(str7));
                }
                String str8 = C0597b0.f9864m0;
                if (bundle.containsKey(str8)) {
                    obj3.f9830o = Integer.valueOf(bundle.getInt(str8));
                }
                String str9 = C0597b0.f9848E0;
                if (bundle.containsKey(str9)) {
                    obj3.f9831p = Boolean.valueOf(bundle.getBoolean(str9));
                }
                String str10 = C0597b0.f9865n0;
                if (bundle.containsKey(str10)) {
                    obj3.f9832q = Boolean.valueOf(bundle.getBoolean(str10));
                }
                String str11 = C0597b0.f9866o0;
                if (bundle.containsKey(str11)) {
                    obj3.f9833r = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = C0597b0.f9867p0;
                if (bundle.containsKey(str12)) {
                    obj3.f9834s = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = C0597b0.f9868q0;
                if (bundle.containsKey(str13)) {
                    obj3.f9835t = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = C0597b0.f9869r0;
                if (bundle.containsKey(str14)) {
                    obj3.f9836u = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = C0597b0.f9870s0;
                if (bundle.containsKey(str15)) {
                    obj3.f9837v = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = C0597b0.f9871t0;
                if (bundle.containsKey(str16)) {
                    obj3.f9838w = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = C0597b0.f9875x0;
                if (bundle.containsKey(str17)) {
                    obj3.f9813A = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = C0597b0.y0;
                if (bundle.containsKey(str18)) {
                    obj3.f9814B = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = C0597b0.f9847D0;
                if (bundle.containsKey(str19)) {
                    obj3.F = Integer.valueOf(bundle.getInt(str19));
                }
                return new C0597b0(obj3);
            case 18:
                if (bundle.getInt(A0.f9418q, -1) != 1) {
                    z9 = false;
                }
                AbstractC0156a.f(z9);
                float f = bundle.getFloat(n0.f10020t, -1.0f);
                if (f == -1.0f) {
                    return new n0();
                }
                return new n0(f);
            case 19:
                int i11 = bundle.getInt(A0.f9418q, -1);
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                c0214f = F0.f9502w;
                            } else {
                                throw new IllegalArgumentException(AbstractC0515y1.l("Unknown RatingType: ", i11));
                            }
                        } else {
                            c0214f = E0.f9493w;
                        }
                    } else {
                        c0214f = n0.f10021u;
                    }
                } else {
                    c0214f = L.f9697w;
                }
                return (A0) c0214f.e(bundle);
            case 20:
                if (bundle.getInt(A0.f9418q, -1) != 2) {
                    z9 = false;
                }
                AbstractC0156a.f(z9);
                int i12 = bundle.getInt(E0.f9491u, 5);
                float f7 = bundle.getFloat(E0.f9492v, -1.0f);
                if (f7 == -1.0f) {
                    return new E0(i12);
                }
                return new E0(i12, f7);
            case 21:
                if (bundle.getInt(A0.f9418q, -1) != 3) {
                    z9 = false;
                }
                AbstractC0156a.f(z9);
                if (bundle.getBoolean(F0.f9500u, false)) {
                    return new F0(bundle.getBoolean(F0.f9501v, false));
                }
                return new F0();
            case 22:
                int i13 = bundle.getInt(H0.f9549x, 0);
                long j9 = bundle.getLong(H0.f9550y, -9223372036854775807L);
                long j10 = bundle.getLong(H0.f9551z, 0L);
                boolean z14 = bundle.getBoolean(H0.f9547A, false);
                Bundle bundle14 = bundle.getBundle(H0.f9548B);
                if (bundle14 != null) {
                    bVar = (I2.b) I2.b.f1232C.e(bundle14);
                } else {
                    bVar = I2.b.f1233w;
                }
                I2.b bVar2 = bVar;
                H0 h02 = new H0();
                h02.j(null, null, i13, j9, j10, bVar2, z14);
                return h02;
            case 23:
                Bundle bundle15 = bundle.getBundle(I0.f9564K);
                if (bundle15 != null) {
                    z8 = (e2.Z) e2.Z.f9799D.e(bundle15);
                } else {
                    z8 = e2.Z.f9800w;
                }
                e2.Z z15 = z8;
                long j11 = bundle.getLong(I0.f9565L, -9223372036854775807L);
                long j12 = bundle.getLong(I0.f9566M, -9223372036854775807L);
                long j13 = bundle.getLong(I0.f9567N, -9223372036854775807L);
                boolean z16 = bundle.getBoolean(I0.f9568O, false);
                boolean z17 = bundle.getBoolean(I0.f9569P, false);
                Bundle bundle16 = bundle.getBundle(I0.f9570Q);
                if (bundle16 != null) {
                    t7 = (T) T.f9743B.e(bundle16);
                }
                boolean z18 = bundle.getBoolean(I0.f9571R, false);
                long j14 = bundle.getLong(I0.f9572S, 0L);
                long j15 = bundle.getLong(I0.f9573T, -9223372036854775807L);
                int i14 = bundle.getInt(I0.f9574U, 0);
                int i15 = bundle.getInt(I0.f9575V, 0);
                long j16 = bundle.getLong(I0.W, 0L);
                I0 i02 = new I0();
                i02.b(I0.f9562I, z15, null, j11, j12, j13, z16, z17, t7, j14, j15, i14, i15, j16);
                i02.f9577B = z18;
                return i02;
            default:
                A4.a aVar = m0.f1132x;
                Bundle bundle17 = bundle.getBundle(K0.f9686v);
                bundle17.getClass();
                m0 m0Var = (m0) aVar.e(bundle17);
                ?? intArray = bundle.getIntArray(K0.f9687w);
                int i16 = m0Var.f1133q;
                return new K0(m0Var, bundle.getBoolean(K0.f9689y, false), (int[]) l0.p(intArray, new int[i16]), (boolean[]) l0.p(bundle.getBooleanArray(K0.f9688x), new boolean[i16]));
        }
    }

    @Override // Z3.b
    public S3.b f(s sVar) {
        Z3.q qVar = (Z3.q) sVar;
        switch (this.f5159q) {
            case 0:
                if (qVar.f4725a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        C0632b G6 = C0632b.G(qVar.f4727c, C0536n.a());
                        if (G6.E() == 0) {
                            C0002c c0002c = new C0002c(18, (byte) 0);
                            c0002c.f1017r = null;
                            c0002c.f1018s = null;
                            c0002c.f1019t = C0212d.f;
                            c0002c.M(G6.C().size());
                            c0002c.O(G6.D().B());
                            c0002c.f1019t = g.a(qVar.f4728e);
                            C0213e q5 = c0002c.q();
                            C0002c c0002c2 = new C0002c(17, (byte) 0);
                            c0002c2.f1018s = null;
                            c0002c2.f1019t = null;
                            c0002c2.f1017r = q5;
                            c0002c2.f1018s = new Z5.n(C0736a.a(G6.C().l()));
                            c0002c2.f1019t = qVar.f;
                            return c0002c2.p();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (com.google.crypto.tink.shaded.protobuf.B | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
            default:
                if (qVar.f4725a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        e4.Q H6 = e4.Q.H(qVar.f4727c, C0536n.a());
                        if (H6.F() == 0) {
                            C4.b bVar = new C4.b(9, false);
                            bVar.f421r = null;
                            bVar.f422s = null;
                            bVar.f423t = null;
                            bVar.f424u = C0212d.f5154o;
                            bVar.f421r = Integer.valueOf(H6.D().size());
                            bVar.f422s = Integer.valueOf(H6.E().D());
                            bVar.f423t = m.a(H6.E().C());
                            bVar.f424u = m.b(qVar.f4728e);
                            l g7 = bVar.g();
                            C0002c c0002c3 = new C0002c(19, (byte) 0);
                            c0002c3.f1018s = null;
                            c0002c3.f1019t = null;
                            c0002c3.f1017r = g7;
                            c0002c3.f1018s = new Z5.n(C0736a.a(H6.D().l()));
                            c0002c3.f1019t = qVar.f;
                            return c0002c3.r();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (com.google.crypto.tink.shaded.protobuf.B | IllegalArgumentException unused2) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    @Override // Z3.n
    public Object g(S3.b bVar) {
        k kVar = (k) bVar;
        Object obj = new Object();
        if (AbstractC1111a.f(2)) {
            return obj;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
