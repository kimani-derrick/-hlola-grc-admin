package g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import com.boxhdo.android.tv.R;
import f0.AbstractC0659a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f10502a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10503b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f10504c;

    public a(float f, float f7, int i7) {
        f = f > 1.0f ? 1.0f : f;
        f = f < 0.0f ? 0.0f : f;
        f7 = f7 > 1.0f ? 1.0f : f7;
        float f8 = f7 >= 0.0f ? f7 : 0.0f;
        Paint paint = new Paint();
        this.f10504c = paint;
        paint.setColor(Color.rgb(Color.red(i7), Color.green(i7), Color.blue(i7)));
        this.f10502a = f;
        this.f10503b = f8;
        b(1.0f);
    }

    public static a a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0659a.f10198b);
        int color = obtainStyledAttributes.getColor(35, context.getResources().getColor(R.color.lb_view_dim_mask_color));
        float fraction = obtainStyledAttributes.getFraction(33, 1, 1, context.getResources().getFraction(R.fraction.lb_view_active_level, 1, 0));
        float fraction2 = obtainStyledAttributes.getFraction(34, 1, 1, context.getResources().getFraction(R.fraction.lb_view_dimmed_level, 1, 1));
        obtainStyledAttributes.recycle();
        return new a(fraction, fraction2, color);
    }

    public final void b(float f) {
        float f7 = this.f10502a;
        float f8 = this.f10503b;
        this.f10504c.setAlpha((int) ((((f7 - f8) * f) + f8) * 255.0f));
    }
}
