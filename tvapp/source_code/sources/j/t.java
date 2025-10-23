package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public final class t extends j implements SubMenu {

    /* renamed from: v  reason: collision with root package name */
    public final j f11511v;

    /* renamed from: w  reason: collision with root package name */
    public final k f11512w;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.f11511v = jVar;
        this.f11512w = kVar;
    }

    @Override // j.j
    public final boolean d(k kVar) {
        return this.f11511v.d(kVar);
    }

    @Override // j.j
    public final boolean e(j jVar, MenuItem menuItem) {
        if (!super.e(jVar, menuItem) && !this.f11511v.e(jVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // j.j
    public final boolean f(k kVar) {
        return this.f11511v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f11512w;
    }

    @Override // j.j
    public final j j() {
        return this.f11511v.j();
    }

    @Override // j.j
    public final boolean l() {
        return this.f11511v.l();
    }

    @Override // j.j
    public final boolean m() {
        return this.f11511v.m();
    }

    @Override // j.j
    public final boolean n() {
        return this.f11511v.n();
    }

    @Override // j.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z7) {
        this.f11511v.setGroupDividerEnabled(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        q(0, null, i7, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        q(i7, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f11512w.setIcon(i7);
        return this;
    }

    @Override // j.j, android.view.Menu
    public final void setQwertyMode(boolean z7) {
        this.f11511v.setQwertyMode(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f11512w.setIcon(drawable);
        return this;
    }
}
