package coil.target;

import M5.g;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f7282r;

    public ImageViewTarget(ImageView imageView) {
        this.f7282r = imageView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageViewTarget) {
            if (g.a(this.f7282r, ((ImageViewTarget) obj).f7282r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7282r.hashCode();
    }

    @Override // coil.target.GenericViewTarget
    public final Drawable j() {
        return this.f7282r.getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public final ImageView k() {
        return this.f7282r;
    }

    @Override // coil.target.GenericViewTarget
    public final void l(Drawable drawable) {
        this.f7282r.setImageDrawable(drawable);
    }
}
