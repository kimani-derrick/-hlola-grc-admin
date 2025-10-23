package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import v.C1303d;
/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i7) {
        C1303d c1303d = (C1303d) getLayoutParams();
        c1303d.f15117a = i7;
        setLayoutParams(c1303d);
    }

    public void setGuidelineEnd(int i7) {
        C1303d c1303d = (C1303d) getLayoutParams();
        c1303d.f15119b = i7;
        setLayoutParams(c1303d);
    }

    public void setGuidelinePercent(float f) {
        C1303d c1303d = (C1303d) getLayoutParams();
        c1303d.f15121c = f;
        setLayoutParams(c1303d);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
