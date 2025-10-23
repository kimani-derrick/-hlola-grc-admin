package androidx.core.graphics.drawable;

import E.c;
import X.i;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f5614k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public Object f5616b;

    /* renamed from: j  reason: collision with root package name */
    public String f5622j;

    /* renamed from: a  reason: collision with root package name */
    public int f5615a = -1;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f5617c = null;
    public Parcelable d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f5618e = 0;
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f5619g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f5620h = f5614k;

    /* renamed from: i  reason: collision with root package name */
    public String f5621i = null;

    public final String toString() {
        String str;
        int height;
        int i7;
        if (this.f5615a == -1) {
            return String.valueOf(this.f5616b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f5615a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f5615a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f5616b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f5616b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f5622j);
                sb.append(" id=");
                int i8 = this.f5615a;
                if (i8 == -1) {
                    int i9 = Build.VERSION.SDK_INT;
                    Object obj = this.f5616b;
                    if (i9 >= 28) {
                        i7 = c.a(obj);
                    } else {
                        try {
                            i7 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            i7 = 0;
                        }
                    }
                } else if (i8 == 2) {
                    i7 = this.f5618e;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i7)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f5618e);
                if (this.f != 0) {
                    sb.append(" off=");
                    height = this.f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f5616b);
                break;
        }
        if (this.f5619g != null) {
            sb.append(" tint=");
            sb.append(this.f5619g);
        }
        if (this.f5620h != f5614k) {
            sb.append(" mode=");
            sb.append(this.f5620h);
        }
        sb.append(")");
        return sb.toString();
    }
}
