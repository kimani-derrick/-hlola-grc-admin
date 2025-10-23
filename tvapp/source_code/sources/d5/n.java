package d5;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9267a;

    /* renamed from: b  reason: collision with root package name */
    public int f9268b;

    /* renamed from: c  reason: collision with root package name */
    public int f9269c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int f9270e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public LinearGradient f9271g;

    /* renamed from: h  reason: collision with root package name */
    public LinearGradient f9272h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f9273i = new Rect();

    /* renamed from: j  reason: collision with root package name */
    public final Paint f9274j;

    public n() {
        Paint paint = new Paint();
        this.f9274j = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setDither(true);
    }

    public final LinearGradient a(int i7, int i8) {
        float f = (i7 - i8) - this.f;
        return new LinearGradient(f - this.f9270e, 0.0f, f, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
    }

    public final LinearGradient b(int i7, int i8) {
        float f = (i7 - i8) - this.f;
        return new LinearGradient(0.0f, f - this.f9270e, 0.0f, f, -16777216, 0, Shader.TileMode.CLAMP);
    }
}
