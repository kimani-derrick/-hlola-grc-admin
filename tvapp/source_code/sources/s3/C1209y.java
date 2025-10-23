package s3;

import com.google.android.gms.internal.measurement.A3;
import com.google.android.gms.internal.measurement.C0408c3;
import com.google.android.gms.internal.measurement.C0418e3;
import com.google.android.gms.internal.measurement.C0463n3;
import com.google.android.gms.internal.measurement.C0468o3;
import com.google.android.gms.internal.measurement.C0473p3;
import com.google.android.gms.internal.measurement.C0478q3;
import com.google.android.gms.internal.measurement.C0497u3;
import com.google.android.gms.internal.measurement.C0507w3;
import com.google.android.gms.internal.measurement.C3;
import com.google.android.gms.internal.measurement.D3;
import com.google.android.gms.internal.measurement.E3;
import com.google.android.gms.internal.measurement.F3;
import com.google.android.gms.internal.measurement.H3;
import com.google.android.gms.internal.measurement.InterfaceC0423f3;
import com.google.android.gms.internal.measurement.InterfaceC0458m3;
import com.google.android.gms.internal.measurement.InterfaceC0482r3;
import com.google.android.gms.internal.measurement.InterfaceC0512x3;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.Q3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.T2;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.V2;
import com.google.android.gms.internal.measurement.W3;
import com.google.android.gms.internal.measurement.X2;
import com.google.android.gms.internal.measurement.X3;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z3;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.l4;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.t4;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
/* renamed from: s3.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1209y implements InterfaceC1147B, u0.b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14389q;

    public /* synthetic */ C1209y(int i7) {
        this.f14389q = i7;
    }

    public static final String b(byte[] bArr, byte[][] bArr2, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f13093e;
        int length = bArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = (i12 + length) / 2;
            while (i13 > i11 && bArr[i13] != 10) {
                i13 += i11;
            }
            int i14 = i13 + 1;
            int i15 = 1;
            while (true) {
                i8 = i14 + i15;
                if (bArr[i8] == 10) {
                    break;
                }
                i15++;
            }
            int i16 = i8 - i14;
            int i17 = i7;
            boolean z8 = false;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (z8) {
                    i9 = 46;
                    z7 = false;
                } else {
                    byte b7 = bArr2[i17][i18];
                    byte[] bArr4 = i6.b.f11390a;
                    int i20 = b7 & 255;
                    z7 = z8;
                    i9 = i20;
                }
                byte b8 = bArr[i14 + i19];
                byte[] bArr5 = i6.b.f11390a;
                i10 = i9 - (b8 & 255);
                if (i10 != 0) {
                    break;
                }
                i19++;
                i18++;
                if (i19 == i16) {
                    break;
                } else if (bArr2[i17].length == i18) {
                    if (i17 == bArr2.length - 1) {
                        break;
                    }
                    i17++;
                    z8 = true;
                    i18 = -1;
                } else {
                    z8 = z7;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i21 = i16 - i19;
                    int length2 = bArr2[i17].length - i18;
                    int length3 = bArr2.length;
                    for (int i22 = i17 + 1; i22 < length3; i22++) {
                        length2 += bArr2[i22].length;
                    }
                    if (length2 >= i21) {
                        if (length2 <= i21) {
                            Charset charset = StandardCharsets.UTF_8;
                            M5.g.e(charset, "UTF_8");
                            return new String(bArr, i14, i16, charset);
                        }
                    }
                }
                i12 = i8 + 1;
                i11 = -1;
            }
            length = i13;
            i11 = -1;
        }
        return null;
    }

    @Override // s3.InterfaceC1147B
    public Object a() {
        switch (this.f14389q) {
            case 0:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                Long l7 = (Long) X2.f8474h.a();
                l7.getClass();
                return l7;
            case 1:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return (String) X2.f8486u.a();
            case 2:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return (String) X2.f8475i.a();
            case 3:
                ((Z3) ((W3) X3.f8492r.get())).getClass();
                Boolean bool = (Boolean) Z3.f8501a.a();
                bool.getClass();
                return bool;
            case 4:
                ((C0507w3) ((InterfaceC0512x3) C0497u3.f8684r.get())).getClass();
                Boolean bool2 = (Boolean) C0507w3.f8711a.a();
                bool2.getClass();
                return bool2;
            case 5:
                ((C0418e3) ((InterfaceC0423f3) C0408c3.f8530r.get())).getClass();
                Boolean bool3 = (Boolean) C0418e3.f8550c.a();
                bool3.getClass();
                return bool3;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((T3) ((Q3) R3.f8413r.get())).getClass();
                Boolean bool4 = (Boolean) T3.f8425a.a();
                bool4.getClass();
                return bool4;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((T3) ((Q3) R3.f8413r.get())).getClass();
                Boolean bool5 = (Boolean) T3.f8427c.a();
                bool5.getClass();
                return bool5;
            case 8:
                ((s4) ((t4) q4.f8653r.get())).getClass();
                Boolean bool6 = (Boolean) s4.f8673a.a();
                bool6.getClass();
                return bool6;
            case 9:
                ((C0478q3) ((InterfaceC0482r3) C0468o3.f8633r.get())).getClass();
                Boolean bool7 = (Boolean) C0478q3.f8651a.a();
                bool7.getClass();
                return bool7;
            case 10:
                ((f4) ((c4) d4.f8540r.get())).getClass();
                Boolean bool8 = (Boolean) f4.f8558a.a();
                bool8.getClass();
                return bool8;
            case 11:
                ((f4) ((c4) d4.f8540r.get())).getClass();
                Boolean bool9 = (Boolean) f4.f8559b.a();
                bool9.getClass();
                return bool9;
            case 12:
                ((l4) ((i4) j4.f8591r.get())).getClass();
                Boolean bool10 = (Boolean) l4.f8610a.a();
                bool10.getClass();
                return bool10;
            case 13:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return (String) X2.f8490y.a();
            case 14:
                ((C3) ((D3) A3.f8226r.get())).getClass();
                Boolean bool11 = (Boolean) C3.f8239a.a();
                bool11.getClass();
                return bool11;
            case 15:
                ((O3) ((P3) M3.f8380r.get())).getClass();
                Boolean bool12 = (Boolean) O3.f8390b.a();
                bool12.getClass();
                return bool12;
            case 16:
                ((X2) ((T2) V2.f8441r.get())).getClass();
                return Integer.valueOf((int) ((Long) X2.f8460O.a()).longValue());
            case 17:
                ((a4) ((b4) Y3.f8496r.get())).getClass();
                Boolean bool13 = (Boolean) a4.f.a();
                bool13.getClass();
                return bool13;
            case 18:
                ((a4) ((b4) Y3.f8496r.get())).getClass();
                Boolean bool14 = (Boolean) a4.f8506b.a();
                bool14.getClass();
                return bool14;
            case 19:
                ((a4) ((b4) Y3.f8496r.get())).getClass();
                Boolean bool15 = (Boolean) a4.f8507c.a();
                bool15.getClass();
                return bool15;
            case 20:
                ((g4) ((h4) e4.f8551r.get())).getClass();
                Boolean bool16 = (Boolean) g4.f8562a.a();
                bool16.getClass();
                return bool16;
            case 21:
                ((C0473p3) ((InterfaceC0458m3) C0463n3.f8619r.get())).getClass();
                Boolean bool17 = (Boolean) C0473p3.f8643c.a();
                bool17.getClass();
                return bool17;
            case 22:
                ((C0473p3) ((InterfaceC0458m3) C0463n3.f8619r.get())).getClass();
                Boolean bool18 = (Boolean) C0473p3.f8642b.a();
                bool18.getClass();
                return bool18;
            case 23:
                ((C0473p3) ((InterfaceC0458m3) C0463n3.f8619r.get())).getClass();
                Boolean bool19 = (Boolean) C0473p3.d.a();
                bool19.getClass();
                return bool19;
            case 24:
                ((H3) ((E3) F3.f8268r.get())).getClass();
                Boolean bool20 = (Boolean) H3.f8355b.a();
                bool20.getClass();
                return bool20;
            case 25:
                ((H3) ((E3) F3.f8268r.get())).getClass();
                Boolean bool21 = (Boolean) H3.f8356c.a();
                bool21.booleanValue();
                return bool21;
            default:
                ((H3) ((E3) F3.f8268r.get())).getClass();
                Boolean bool22 = (Boolean) H3.d.a();
                bool22.getClass();
                return bool22;
        }
    }

    @Override // u0.b
    public void f() {
    }

    @Override // u0.b
    public void g(int i7, Object obj) {
    }
}
