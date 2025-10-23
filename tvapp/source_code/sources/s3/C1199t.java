package s3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import y2.C1494a;
import z2.C1513a;
/* renamed from: s3.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199t implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14238a;

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, w0.B] */
    /* JADX WARN: Type inference failed for: r2v7, types: [w0.q0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [w0.r0, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z7;
        boolean z8;
        boolean z9;
        switch (this.f14238a) {
            case 0:
                int Y6 = w4.l0.Y(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < Y6) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        w4.l0.T(parcel, readInt);
                    } else {
                        bundle = w4.l0.f(parcel, readInt);
                    }
                }
                w4.l0.m(parcel, Y6);
                return new r(bundle);
            case 1:
                int Y7 = w4.l0.Y(parcel);
                String str = null;
                r rVar = null;
                String str2 = null;
                long j7 = 0;
                while (parcel.dataPosition() < Y7) {
                    int readInt2 = parcel.readInt();
                    char c5 = (char) readInt2;
                    if (c5 != 2) {
                        if (c5 != 3) {
                            if (c5 != 4) {
                                if (c5 != 5) {
                                    w4.l0.T(parcel, readInt2);
                                } else {
                                    j7 = w4.l0.L(parcel, readInt2);
                                }
                            } else {
                                str2 = w4.l0.i(parcel, readInt2);
                            }
                        } else {
                            rVar = (r) w4.l0.h(parcel, readInt2, r.CREATOR);
                        }
                    } else {
                        str = w4.l0.i(parcel, readInt2);
                    }
                }
                w4.l0.m(parcel, Y7);
                return new C1201u(str, rVar, str2, j7);
            case 2:
                int Y8 = w4.l0.Y(parcel);
                String str3 = null;
                long j8 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < Y8) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                w4.l0.T(parcel, readInt3);
                            } else {
                                i7 = w4.l0.K(parcel, readInt3);
                            }
                        } else {
                            j8 = w4.l0.L(parcel, readInt3);
                        }
                    } else {
                        str3 = w4.l0.i(parcel, readInt3);
                    }
                }
                w4.l0.m(parcel, Y8);
                return new j1(i7, j8, str3);
            case 3:
                int Y9 = w4.l0.Y(parcel);
                int i8 = 0;
                String str4 = null;
                Long l7 = null;
                Float f = null;
                String str5 = null;
                String str6 = null;
                Double d = null;
                long j9 = 0;
                while (parcel.dataPosition() < Y9) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i8 = w4.l0.K(parcel, readInt4);
                            break;
                        case 2:
                            str4 = w4.l0.i(parcel, readInt4);
                            break;
                        case 3:
                            j9 = w4.l0.L(parcel, readInt4);
                            break;
                        case 4:
                            int M6 = w4.l0.M(parcel, readInt4);
                            if (M6 == 0) {
                                l7 = null;
                                break;
                            } else {
                                w4.l0.b0(parcel, M6, 8);
                                l7 = Long.valueOf(parcel.readLong());
                                break;
                            }
                        case 5:
                            int M7 = w4.l0.M(parcel, readInt4);
                            if (M7 == 0) {
                                f = null;
                                break;
                            } else {
                                w4.l0.b0(parcel, M7, 4);
                                f = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            str5 = w4.l0.i(parcel, readInt4);
                            break;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            str6 = w4.l0.i(parcel, readInt4);
                            break;
                        case '\b':
                            int M8 = w4.l0.M(parcel, readInt4);
                            if (M8 == 0) {
                                d = null;
                                break;
                            } else {
                                w4.l0.b0(parcel, M8, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        default:
                            w4.l0.T(parcel, readInt4);
                            break;
                    }
                }
                w4.l0.m(parcel, Y9);
                return new u1(i8, str4, j9, l7, f, str5, str6, d);
            case 4:
                int Y10 = w4.l0.Y(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                Boolean bool = null;
                ArrayList<String> arrayList = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = false;
                int i9 = 0;
                boolean z13 = false;
                boolean z14 = false;
                int i10 = 0;
                long j17 = -2147483648L;
                String str17 = "";
                String str18 = str17;
                String str19 = str18;
                String str20 = str19;
                int i11 = 100;
                while (parcel.dataPosition() < Y10) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str7 = w4.l0.i(parcel, readInt5);
                            break;
                        case 3:
                            str8 = w4.l0.i(parcel, readInt5);
                            break;
                        case 4:
                            str9 = w4.l0.i(parcel, readInt5);
                            break;
                        case 5:
                            str10 = w4.l0.i(parcel, readInt5);
                            break;
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            j10 = w4.l0.L(parcel, readInt5);
                            break;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            j11 = w4.l0.L(parcel, readInt5);
                            break;
                        case '\b':
                            str11 = w4.l0.i(parcel, readInt5);
                            break;
                        case '\t':
                            z10 = w4.l0.I(parcel, readInt5);
                            break;
                        case '\n':
                            z12 = w4.l0.I(parcel, readInt5);
                            break;
                        case 11:
                            j17 = w4.l0.L(parcel, readInt5);
                            break;
                        case '\f':
                            str12 = w4.l0.i(parcel, readInt5);
                            break;
                        case '\r':
                            j12 = w4.l0.L(parcel, readInt5);
                            break;
                        case 14:
                            j13 = w4.l0.L(parcel, readInt5);
                            break;
                        case 15:
                            i9 = w4.l0.K(parcel, readInt5);
                            break;
                        case 16:
                            z11 = w4.l0.I(parcel, readInt5);
                            break;
                        case 17:
                        case 20:
                        case '!':
                        default:
                            w4.l0.T(parcel, readInt5);
                            break;
                        case 18:
                            z13 = w4.l0.I(parcel, readInt5);
                            break;
                        case 19:
                            str13 = w4.l0.i(parcel, readInt5);
                            break;
                        case 21:
                            int M9 = w4.l0.M(parcel, readInt5);
                            if (M9 == 0) {
                                bool = null;
                                break;
                            } else {
                                w4.l0.b0(parcel, M9, 4);
                                if (parcel.readInt() != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                bool = Boolean.valueOf(z7);
                                break;
                            }
                        case 22:
                            j14 = w4.l0.L(parcel, readInt5);
                            break;
                        case 23:
                            int M10 = w4.l0.M(parcel, readInt5);
                            int dataPosition = parcel.dataPosition();
                            if (M10 == 0) {
                                arrayList = null;
                                break;
                            } else {
                                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(dataPosition + M10);
                                arrayList = createStringArrayList;
                                break;
                            }
                        case 24:
                            str14 = w4.l0.i(parcel, readInt5);
                            break;
                        case 25:
                            str17 = w4.l0.i(parcel, readInt5);
                            break;
                        case 26:
                            str18 = w4.l0.i(parcel, readInt5);
                            break;
                        case 27:
                            str15 = w4.l0.i(parcel, readInt5);
                            break;
                        case 28:
                            z14 = w4.l0.I(parcel, readInt5);
                            break;
                        case 29:
                            j15 = w4.l0.L(parcel, readInt5);
                            break;
                        case 30:
                            i11 = w4.l0.K(parcel, readInt5);
                            break;
                        case 31:
                            str19 = w4.l0.i(parcel, readInt5);
                            break;
                        case ' ':
                            i10 = w4.l0.K(parcel, readInt5);
                            break;
                        case '\"':
                            j16 = w4.l0.L(parcel, readInt5);
                            break;
                        case '#':
                            str16 = w4.l0.i(parcel, readInt5);
                            break;
                        case '$':
                            str20 = w4.l0.i(parcel, readInt5);
                            break;
                    }
                }
                w4.l0.m(parcel, Y10);
                return new m1(str7, str8, str9, str10, j10, j11, str11, z10, z12, j17, str12, j12, j13, i9, z11, z13, str13, bool, j14, arrayList, str14, str17, str18, str15, z14, j15, i11, str19, i10, j16, str16, str20);
            case 5:
                ?? obj = new Object();
                obj.f15442q = parcel.readInt();
                obj.f15443r = parcel.readInt();
                boolean z15 = true;
                if (parcel.readInt() != 1) {
                    z15 = false;
                }
                obj.f15444s = z15;
                return obj;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? obj2 = new Object();
                obj2.f15632q = parcel.readInt();
                obj2.f15633r = parcel.readInt();
                boolean z16 = true;
                if (parcel.readInt() != 1) {
                    z16 = false;
                }
                obj2.f15635t = z16;
                int readInt6 = parcel.readInt();
                if (readInt6 > 0) {
                    int[] iArr = new int[readInt6];
                    obj2.f15634s = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj2;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ?? obj3 = new Object();
                obj3.f15640q = parcel.readInt();
                obj3.f15641r = parcel.readInt();
                int readInt7 = parcel.readInt();
                obj3.f15642s = readInt7;
                if (readInt7 > 0) {
                    int[] iArr2 = new int[readInt7];
                    obj3.f15643t = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt8 = parcel.readInt();
                obj3.f15644u = readInt8;
                if (readInt8 > 0) {
                    int[] iArr3 = new int[readInt8];
                    obj3.f15645v = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z17 = false;
                if (parcel.readInt() == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                obj3.f15647x = z8;
                if (parcel.readInt() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                obj3.f15648y = z9;
                if (parcel.readInt() == 1) {
                    z17 = true;
                }
                obj3.f15649z = z17;
                obj3.f15646w = parcel.readArrayList(w0.q0.class.getClassLoader());
                return obj3;
            case 8:
                String readString = parcel.readString();
                readString.getClass();
                return new C1494a(readString, parcel.readInt());
            default:
                return new C1513a(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f14238a) {
            case 0:
                return new r[i7];
            case 1:
                return new C1201u[i7];
            case 2:
                return new j1[i7];
            case 3:
                return new u1[i7];
            case 4:
                return new m1[i7];
            case 5:
                return new w0.B[i7];
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new w0.q0[i7];
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new w0.r0[i7];
            case 8:
                return new C1494a[i7];
            default:
                return new C1513a[i7];
        }
    }
}
