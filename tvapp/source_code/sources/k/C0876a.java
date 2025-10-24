package k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
/* renamed from: k.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f11982a;

    public C0876a(ActionBarContainer actionBarContainer) {
        this.f11982a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f11982a;
        if (actionBarContainer.f5419w) {
            Drawable drawable = actionBarContainer.f5418v;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f5416t;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f5417u;
        if (drawable3 != null && actionBarContainer.f5420x) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f11982a;
        if (actionBarContainer.f5419w) {
            if (actionBarContainer.f5418v != null) {
                drawable = actionBarContainer.f5416t;
            } else {
                return;
            }
        } else {
            drawable = actionBarContainer.f5416t;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
