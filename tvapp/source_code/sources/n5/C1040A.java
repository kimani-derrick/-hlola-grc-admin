package n5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.math.BigDecimal;
import v6.C1341f;
import v6.C1344i;
/* renamed from: n5.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040A extends k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12664a;

    public /* synthetic */ C1040A(int i7) {
        this.f12664a = i7;
    }

    @Override // n5.k
    public final Object b(n nVar) {
        C1344i c1344i;
        long parseLong;
        switch (this.f12664a) {
            case 0:
                return nVar.O();
            case 1:
                o oVar = (o) nVar;
                int i7 = oVar.f12714w;
                if (i7 == 0) {
                    i7 = oVar.c0();
                }
                boolean z7 = false;
                if (i7 == 5) {
                    oVar.f12714w = 0;
                    int[] iArr = oVar.f12706t;
                    int i8 = oVar.f12703q - 1;
                    iArr[i8] = iArr[i8] + 1;
                    z7 = true;
                } else if (i7 == 6) {
                    oVar.f12714w = 0;
                    int[] iArr2 = oVar.f12706t;
                    int i9 = oVar.f12703q - 1;
                    iArr2[i9] = iArr2[i9] + 1;
                } else {
                    throw new RuntimeException("Expected a boolean but was " + AbstractC0515y1.z(oVar.V()) + " at path " + oVar.j());
                }
                return Boolean.valueOf(z7);
            case 2:
                return Byte.valueOf((byte) AbstractC1043D.g(nVar, "a byte", -128, 255));
            case 3:
                String O5 = nVar.O();
                if (O5.length() <= 1) {
                    return Character.valueOf(O5.charAt(0));
                }
                throw new RuntimeException("Expected a char but was " + ("\"" + O5 + '\"') + " at path " + nVar.j());
            case 4:
                return Double.valueOf(nVar.r());
            case 5:
                float r3 = (float) nVar.r();
                nVar.getClass();
                if (!Float.isInfinite(r3)) {
                    return Float.valueOf(r3);
                }
                throw new RuntimeException("JSON forbids NaN and infinities: " + r3 + " at path " + nVar.j());
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(nVar.x());
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                o oVar2 = (o) nVar;
                int i10 = oVar2.f12714w;
                if (i10 == 0) {
                    i10 = oVar2.c0();
                }
                if (i10 == 16) {
                    oVar2.f12714w = 0;
                    int[] iArr3 = oVar2.f12706t;
                    int i11 = oVar2.f12703q - 1;
                    iArr3[i11] = iArr3[i11] + 1;
                    parseLong = oVar2.f12715x;
                } else {
                    if (i10 == 17) {
                        C1341f c1341f = oVar2.f12713v;
                        c1341f.getClass();
                        oVar2.f12717z = c1341f.a0(oVar2.f12716y, U5.a.f3474a);
                    } else if (i10 != 9 && i10 != 8) {
                        if (i10 != 11) {
                            throw new RuntimeException("Expected a long but was " + AbstractC0515y1.z(oVar2.V()) + " at path " + oVar2.j());
                        }
                    } else {
                        if (i10 == 9) {
                            c1344i = o.f12708B;
                        } else {
                            c1344i = o.f12707A;
                        }
                        String i02 = oVar2.i0(c1344i);
                        oVar2.f12717z = i02;
                        try {
                            parseLong = Long.parseLong(i02);
                            oVar2.f12714w = 0;
                            int[] iArr4 = oVar2.f12706t;
                            int i12 = oVar2.f12703q - 1;
                            iArr4[i12] = iArr4[i12] + 1;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    oVar2.f12714w = 11;
                    try {
                        parseLong = new BigDecimal(oVar2.f12717z).longValueExact();
                        oVar2.f12717z = null;
                        oVar2.f12714w = 0;
                        int[] iArr5 = oVar2.f12706t;
                        int i13 = oVar2.f12703q - 1;
                        iArr5[i13] = iArr5[i13] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new RuntimeException("Expected a long but was " + oVar2.f12717z + " at path " + oVar2.j());
                    }
                }
                return Long.valueOf(parseLong);
            default:
                return Short.valueOf((short) AbstractC1043D.g(nVar, "a short", -32768, 32767));
        }
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        String str;
        switch (this.f12664a) {
            case 0:
                qVar.y((String) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                p pVar = (p) qVar;
                if (!pVar.f12725u) {
                    pVar.Y();
                    pVar.O();
                    if (booleanValue) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    pVar.f12719w.G(str);
                    int[] iArr = pVar.f12724t;
                    int i7 = pVar.f12721q - 1;
                    iArr[i7] = iArr[i7] + 1;
                    return;
                }
                throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + pVar.h());
            case 2:
                qVar.x(((Byte) obj).intValue() & 255);
                return;
            case 3:
                qVar.y(((Character) obj).toString());
                return;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                p pVar2 = (p) qVar;
                pVar2.getClass();
                if (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue)) {
                    if (pVar2.f12725u) {
                        pVar2.f12725u = false;
                        pVar2.j(Double.toString(doubleValue));
                        return;
                    }
                    pVar2.Y();
                    pVar2.O();
                    pVar2.f12719w.G(Double.toString(doubleValue));
                    int[] iArr2 = pVar2.f12724t;
                    int i8 = pVar2.f12721q - 1;
                    iArr2[i8] = iArr2[i8] + 1;
                    return;
                }
                throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
            case 5:
                Float f = (Float) obj;
                f.getClass();
                p pVar3 = (p) qVar;
                pVar3.getClass();
                String obj2 = f.toString();
                pVar3.getClass();
                if (!obj2.equals("-Infinity") && !obj2.equals("Infinity") && !obj2.equals("NaN")) {
                    if (pVar3.f12725u) {
                        pVar3.f12725u = false;
                        pVar3.j(obj2);
                        return;
                    }
                    pVar3.Y();
                    pVar3.O();
                    pVar3.f12719w.G(obj2);
                    int[] iArr3 = pVar3.f12724t;
                    int i9 = pVar3.f12721q - 1;
                    iArr3[i9] = iArr3[i9] + 1;
                    return;
                }
                throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                qVar.x(((Integer) obj).intValue());
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                qVar.x(((Long) obj).longValue());
                return;
            default:
                qVar.x(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.f12664a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "JsonAdapter(Integer)";
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
