package H0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f816a;

    public d(Drawable.ConstantState constantState) {
        this.f816a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f816a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f816a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable newDrawable = this.f816a.newDrawable();
        eVar.f822q = newDrawable;
        newDrawable.setCallback(eVar.f819t);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable newDrawable = this.f816a.newDrawable(resources);
        eVar.f822q = newDrawable;
        newDrawable.setCallback(eVar.f819t);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable newDrawable = this.f816a.newDrawable(resources, theme);
        eVar.f822q = newDrawable;
        newDrawable.setCallback(eVar.f819t);
        return eVar;
    }
}
