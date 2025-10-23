package C2;

import O3.E;
import O3.U;
import Z2.AbstractC0156a;
import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0595a0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new A2.a(13);

    /* renamed from: r  reason: collision with root package name */
    public final String f416r;

    /* renamed from: s  reason: collision with root package name */
    public final E f417s;

    public n(String str, String str2, U u7) {
        super(str);
        AbstractC0156a.f(!u7.isEmpty());
        this.f416r = str2;
        E s6 = E.s(u7);
        this.f417s = s6;
        String str3 = (String) s6.get(0);
    }

    public static ArrayList a(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            } else {
                if (str.length() >= 4) {
                    parseInt = Integer.parseInt(str.substring(0, 4));
                }
                return arrayList;
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // C2.j, x2.InterfaceC1460b
    public final void c(C0595a0 c0595a0) {
        Integer num;
        String str = this.f405q;
        str.getClass();
        char c5 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c5 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c5 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c5 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c5 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c5 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c5 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c5 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c5 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c5 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c5 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c5 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c5 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c5 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c5 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c5 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c5 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c5 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c5 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c5 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c5 = 21;
                    break;
                }
                break;
        }
        E e3 = this.f417s;
        try {
            switch (c5) {
                case 0:
                case '\n':
                    c0595a0.c((CharSequence) e3.get(0));
                    return;
                case 1:
                case 11:
                    c0595a0.e((CharSequence) e3.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = (String) e3.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    c0595a0.h(Integer.valueOf(parseInt));
                    c0595a0.g(Integer.valueOf(parseInt2));
                    return;
                case 3:
                case 17:
                    c0595a0.d((CharSequence) e3.get(0));
                    return;
                case 4:
                case 18:
                    c0595a0.b((CharSequence) e3.get(0));
                    return;
                case 5:
                case 19:
                    c0595a0.f((CharSequence) e3.get(0));
                    return;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                case 20:
                    String[] Q4 = H.Q((String) e3.get(0));
                    int parseInt3 = Integer.parseInt(Q4[0]);
                    if (Q4.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(Q4[1]));
                    } else {
                        num = null;
                    }
                    c0595a0.o(Integer.valueOf(parseInt3));
                    c0595a0.n(num);
                    return;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                case 16:
                    c0595a0.m((CharSequence) e3.get(0));
                    return;
                case '\b':
                case 15:
                    c0595a0.p((CharSequence) e3.get(0));
                    return;
                case '\t':
                case 21:
                    c0595a0.i(Integer.valueOf(Integer.parseInt((String) e3.get(0))));
                    return;
                case '\r':
                    ArrayList a7 = a((String) e3.get(0));
                    int size = a7.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c0595a0.g((Integer) a7.get(2));
                            } else {
                                return;
                            }
                        }
                        c0595a0.h((Integer) a7.get(1));
                    }
                    c0595a0.i((Integer) a7.get(0));
                    return;
                case 14:
                    ArrayList a8 = a((String) e3.get(0));
                    int size2 = a8.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c0595a0.j((Integer) a8.get(2));
                            } else {
                                return;
                            }
                        }
                        c0595a0.k((Integer) a8.get(1));
                    }
                    c0595a0.l((Integer) a8.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (H.a(this.f405q, nVar.f405q) && H.a(this.f416r, nVar.f416r) && this.f417s.equals(nVar.f417s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = AbstractC0515y1.i(527, 31, this.f405q);
        String str = this.f416r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return this.f417s.hashCode() + ((i8 + i7) * 31);
    }

    @Override // C2.j
    public final String toString() {
        return this.f405q + ": description=" + this.f416r + ": values=" + this.f417s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f405q);
        parcel.writeString(this.f416r);
        parcel.writeStringArray((String[]) this.f417s.toArray(new String[0]));
    }
}
