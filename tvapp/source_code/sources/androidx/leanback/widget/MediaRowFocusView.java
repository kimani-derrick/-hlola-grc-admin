package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
class MediaRowFocusView extends View {

    /* renamed from: q  reason: collision with root package name */
    public final Paint f6430q;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f6431r;

    /* renamed from: s  reason: collision with root package name */
    public int f6432s;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6431r = new RectF();
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lb_playback_media_row_highlight_color));
        this.f6430q = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f6432s = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        RectF rectF = this.f6431r;
        rectF.set(0.0f, -height2, getWidth(), getHeight() + height2);
        int i7 = this.f6432s;
        canvas.drawRoundRect(rectF, i7, i7, this.f6430q);
    }
}
