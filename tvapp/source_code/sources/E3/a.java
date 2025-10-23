package E3;

import android.content.Context;
import android.util.TypedValue;
import com.boxhdo.android.tv.R;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f609a;

    /* renamed from: b  reason: collision with root package name */
    public final int f610b;

    /* renamed from: c  reason: collision with root package name */
    public final int f611c;
    public final float d;

    public a(Context context) {
        boolean z7;
        int i7;
        TypedValue D6 = AbstractC0958a.D(context, R.attr.elevationOverlayEnabled);
        if (D6 != null && D6.type == 18 && D6.data != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f609a = z7;
        TypedValue D7 = AbstractC0958a.D(context, R.attr.elevationOverlayColor);
        if (D7 != null) {
            i7 = D7.data;
        } else {
            i7 = 0;
        }
        this.f610b = i7;
        TypedValue D8 = AbstractC0958a.D(context, R.attr.colorSurface);
        this.f611c = D8 != null ? D8.data : 0;
        this.d = context.getResources().getDisplayMetrics().density;
    }
}
