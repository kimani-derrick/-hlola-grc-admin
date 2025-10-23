package A2;

import C2.d;
import C2.e;
import C2.f;
import C2.k;
import C2.l;
import C2.m;
import C2.n;
import C2.o;
import E2.j;
import M5.g;
import O3.E;
import X.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f56a;

    public /* synthetic */ a(int i7) {
        this.f56a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.View$BaseSavedState, java.lang.Object, P.l] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f56a) {
            case 0:
                return new b(parcel);
            case 1:
                return new c(parcel);
            case 2:
                return new B2.b(parcel);
            case 3:
                return new B2.c(parcel);
            case 4:
                return new C2.a(parcel);
            case 5:
                return new C2.b(parcel);
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C2.c(parcel);
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new d(parcel);
            case 8:
                return new e(parcel);
            case 9:
                return new f(parcel);
            case 10:
                return new k(parcel);
            case 11:
                return new l(parcel);
            case 12:
                return new m(parcel);
            case 13:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new n(readString, readString2, E.t(createStringArray));
            case 14:
                return new o(parcel);
            case 15:
                return new D2.a(parcel);
            case 16:
                return new D2.b(parcel);
            case 17:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, D2.c.class.getClassLoader());
                return new D2.d(arrayList);
            case 18:
                return new D2.c(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 19:
                return new D2.e(parcel);
            case 20:
                return new E2.a(parcel);
            case 21:
                return new E2.e(parcel);
            case 22:
                return new Object();
            case 23:
                return new E2.i(parcel);
            case 24:
                return new j(parcel.readLong(), parcel.readLong());
            case 25:
                return new c(parcel);
            case 26:
                return new G2.a(parcel);
            case 27:
                return new ParcelImpl(parcel);
            case 28:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f2757q = parcel.readInt();
                return baseSavedState;
            default:
                String readString3 = parcel.readString();
                g.c(readString3);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i7 = 0; i7 < readInt; i7++) {
                    String readString4 = parcel.readString();
                    g.c(readString4);
                    String readString5 = parcel.readString();
                    g.c(readString5);
                    linkedHashMap.put(readString4, readString5);
                }
                return new Q0.b(readString3, linkedHashMap);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f56a) {
            case 0:
                return new b[i7];
            case 1:
                return new c[i7];
            case 2:
                return new B2.b[i7];
            case 3:
                return new B2.c[i7];
            case 4:
                return new C2.a[i7];
            case 5:
                return new C2.b[i7];
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C2.c[i7];
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new d[i7];
            case 8:
                return new e[i7];
            case 9:
                return new f[i7];
            case 10:
                return new k[i7];
            case 11:
                return new l[i7];
            case 12:
                return new m[i7];
            case 13:
                return new n[i7];
            case 14:
                return new o[i7];
            case 15:
                return new D2.a[i7];
            case 16:
                return new D2.b[i7];
            case 17:
                return new D2.d[i7];
            case 18:
                return new D2.c[i7];
            case 19:
                return new D2.e[i7];
            case 20:
                return new E2.a[i7];
            case 21:
                return new E2.e[i7];
            case 22:
                return new E2.f[i7];
            case 23:
                return new E2.i[i7];
            case 24:
                return new j[i7];
            case 25:
                return new F2.a[i7];
            case 26:
                return new G2.a[i7];
            case 27:
                return new ParcelImpl[i7];
            case 28:
                return new P.l[i7];
            default:
                return new Q0.b[i7];
        }
    }
}
