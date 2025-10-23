package H0;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f811q = 1;

    /* renamed from: r  reason: collision with root package name */
    public Object f812r;

    public /* synthetic */ b() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f811q) {
            case 0:
                ((e) this.f812r).invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        switch (this.f811q) {
            case 0:
                ((e) this.f812r).scheduleSelf(runnable, j7);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f812r;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j7);
                    return;
                }
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f811q) {
            case 0:
                ((e) this.f812r).unscheduleSelf(runnable);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f812r;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public b(e eVar) {
        this.f812r = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
