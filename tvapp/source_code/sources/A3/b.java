package A3;

import L3.x;
import X.i;
import android.os.Parcel;
import android.os.Parcelable;
import k.C0849D0;
import k.Q0;
import w0.d0;
import x.C1443f;
import z3.C1515b;
/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f67a;

    public /* synthetic */ b(int i7) {
        this.f67a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f67a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new F3.a(parcel, null);
            case 2:
                return new x(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return S.b.f2937r;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C0849D0(parcel, null);
            case 5:
                return new Q0(parcel, null);
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new d0(parcel, null);
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1443f(parcel, null);
            default:
                return new C1515b(parcel, (ClassLoader) null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f67a) {
            case 0:
                return new c[i7];
            case 1:
                return new F3.a[i7];
            case 2:
                return new x[i7];
            case 3:
                return new S.b[i7];
            case 4:
                return new C0849D0[i7];
            case 5:
                return new Q0[i7];
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new d0[i7];
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1443f[i7];
            default:
                return new C1515b[i7];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f67a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new F3.a(parcel, classLoader);
            case 2:
                return new x(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return S.b.f2937r;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C0849D0(parcel, classLoader);
            case 5:
                return new Q0(parcel, classLoader);
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new d0(parcel, classLoader);
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1443f(parcel, classLoader);
            default:
                return new C1515b(parcel, classLoader);
        }
    }
}
