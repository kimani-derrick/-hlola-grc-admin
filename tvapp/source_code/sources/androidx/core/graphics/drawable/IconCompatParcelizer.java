package androidx.core.graphics.drawable;

import I0.a;
import I0.b;
import X.i;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5615a = aVar.f(iconCompat.f5615a, 1);
        byte[] bArr = iconCompat.f5617c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1208e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f5617c = bArr;
        iconCompat.d = aVar.g(iconCompat.d, 3);
        iconCompat.f5618e = aVar.f(iconCompat.f5618e, 4);
        iconCompat.f = aVar.f(iconCompat.f, 5);
        iconCompat.f5619g = (ColorStateList) aVar.g(iconCompat.f5619g, 6);
        String str = iconCompat.f5621i;
        if (aVar.e(7)) {
            str = ((b) aVar).f1208e.readString();
        }
        iconCompat.f5621i = str;
        String str2 = iconCompat.f5622j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f1208e.readString();
        }
        iconCompat.f5622j = str2;
        iconCompat.f5620h = PorterDuff.Mode.valueOf(iconCompat.f5621i);
        switch (iconCompat.f5615a) {
            case -1:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f5616b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    byte[] bArr3 = iconCompat.f5617c;
                    iconCompat.f5616b = bArr3;
                    iconCompat.f5615a = 3;
                    iconCompat.f5618e = 0;
                    iconCompat.f = bArr3.length;
                    break;
                }
                iconCompat.f5616b = parcelable;
                break;
            case 2:
            case 4:
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f5617c, Charset.forName("UTF-16"));
                iconCompat.f5616b = str3;
                if (iconCompat.f5615a == 2 && iconCompat.f5622j == null) {
                    iconCompat.f5622j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f5616b = iconCompat.f5617c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f5621i = iconCompat.f5620h.name();
        switch (iconCompat.f5615a) {
            case -1:
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f5616b;
                break;
            case 2:
                iconCompat.f5617c = ((String) iconCompat.f5616b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5617c = (byte[]) iconCompat.f5616b;
                break;
            case 4:
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f5617c = iconCompat.f5616b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f5615a;
        if (-1 != i7) {
            aVar.j(i7, 1);
        }
        byte[] bArr = iconCompat.f5617c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f1208e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i8 = iconCompat.f5618e;
        if (i8 != 0) {
            aVar.j(i8, 4);
        }
        int i9 = iconCompat.f;
        if (i9 != 0) {
            aVar.j(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f5619g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f5621i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f1208e.writeString(str);
        }
        String str2 = iconCompat.f5622j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f1208e.writeString(str2);
        }
    }
}
