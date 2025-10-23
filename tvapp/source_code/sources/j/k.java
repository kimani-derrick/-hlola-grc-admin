package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k implements MenuItem {

    /* renamed from: A  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f11465A;

    /* renamed from: a  reason: collision with root package name */
    public final int f11467a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11468b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11469c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f11470e;
    public CharSequence f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f11471g;

    /* renamed from: h  reason: collision with root package name */
    public char f11472h;

    /* renamed from: j  reason: collision with root package name */
    public char f11474j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f11476l;
    public final j n;

    /* renamed from: o  reason: collision with root package name */
    public t f11478o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f11479p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f11480q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f11481r;

    /* renamed from: z  reason: collision with root package name */
    public View f11489z;

    /* renamed from: i  reason: collision with root package name */
    public int f11473i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f11475k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f11477m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f11482s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f11483t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11484u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11485v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11486w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f11487x = 16;

    /* renamed from: B  reason: collision with root package name */
    public boolean f11466B = false;

    /* renamed from: y  reason: collision with root package name */
    public int f11488y = 0;

    public k(j jVar, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.n = jVar;
        this.f11467a = i8;
        this.f11468b = i7;
        this.f11469c = i9;
        this.d = i10;
        this.f11470e = charSequence;
    }

    public static void a(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f11486w && (this.f11484u || this.f11485v)) {
            drawable = drawable.mutate();
            if (this.f11484u) {
                E.a.h(drawable, this.f11482s);
            }
            if (this.f11485v) {
                E.a.i(drawable, this.f11483t);
            }
            this.f11486w = false;
        }
        return drawable;
    }

    public final boolean c() {
        if ((this.f11488y & 8) == 0 || this.f11489z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f11488y & 8) == 0) {
            return false;
        }
        if (this.f11489z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f11465A;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.n.d(this);
    }

    public final boolean d() {
        if ((this.f11487x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final k e(CharSequence charSequence) {
        this.f11480q = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f11465A;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.n.f(this);
    }

    public final void f(boolean z7) {
        int i7;
        if (z7) {
            i7 = this.f11487x | 32;
        } else {
            i7 = this.f11487x & (-33);
        }
        this.f11487x = i7;
    }

    public final k g(CharSequence charSequence) {
        this.f11481r = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f11489z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f11475k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f11474j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f11480q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f11468b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f11476l;
        if (drawable != null) {
            return b(drawable);
        }
        int i7 = this.f11477m;
        if (i7 != 0) {
            Drawable i02 = android.support.v4.media.session.b.i0(this.n.f11448a, i7);
            this.f11477m = 0;
            this.f11476l = i02;
            return b(i02);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f11482s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11483t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f11471g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f11467a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f11473i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f11472h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f11469c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f11478o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f11470e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            return this.f11470e;
        }
        return charSequence;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f11481r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f11478o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f11466B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f11487x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f11487x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f11487x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f11487x & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i8;
        Context context = this.n.f11448a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f11489z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i8 = this.f11467a) > 0) {
            inflate.setId(i8);
        }
        j jVar = this.n;
        jVar.f11456k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5) {
        if (this.f11474j == c5) {
            return this;
        }
        this.f11474j = Character.toLowerCase(c5);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z7) {
        int i7 = this.f11487x;
        int i8 = (z7 ? 1 : 0) | (i7 & (-2));
        this.f11487x = i8;
        if (i7 != i8) {
            this.n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z7) {
        boolean z8;
        int i7;
        int i8 = this.f11487x;
        int i9 = 2;
        if ((i8 & 4) != 0) {
            j jVar = this.n;
            jVar.getClass();
            ArrayList arrayList = jVar.f;
            int size = arrayList.size();
            jVar.s();
            for (int i10 = 0; i10 < size; i10++) {
                k kVar = (k) arrayList.get(i10);
                if (kVar.f11468b == this.f11468b && (kVar.f11487x & 4) != 0 && kVar.isCheckable()) {
                    if (kVar == this) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i11 = kVar.f11487x;
                    int i12 = i11 & (-3);
                    if (z8) {
                        i7 = 2;
                    } else {
                        i7 = 0;
                    }
                    int i13 = i7 | i12;
                    kVar.f11487x = i13;
                    if (i11 != i13) {
                        kVar.n.o(false);
                    }
                }
            }
            jVar.r();
        } else {
            int i14 = i8 & (-3);
            if (!z7) {
                i9 = 0;
            }
            int i15 = i14 | i9;
            this.f11487x = i15;
            if (i8 != i15) {
                this.n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z7) {
        int i7;
        if (z7) {
            i7 = this.f11487x | 16;
        } else {
            i7 = this.f11487x & (-17);
        }
        this.f11487x = i7;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f11476l = null;
        this.f11477m = i7;
        this.f11486w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11482s = colorStateList;
        this.f11484u = true;
        this.f11486w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11483t = mode;
        this.f11485v = true;
        this.f11486w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f11471g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5) {
        if (this.f11472h == c5) {
            return this;
        }
        this.f11472h = c5;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11465A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11479p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6) {
        this.f11472h = c5;
        this.f11474j = Character.toLowerCase(c6);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f11488y = i7;
        j jVar = this.n;
        jVar.f11456k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.n.f11448a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z7) {
        int i7;
        int i8 = this.f11487x;
        int i9 = i8 & (-9);
        if (z7) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        int i10 = i7 | i9;
        this.f11487x = i10;
        if (i8 != i10) {
            j jVar = this.n;
            jVar.f11453h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f11470e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c5, int i7) {
        if (this.f11474j == c5 && this.f11475k == i7) {
            return this;
        }
        this.f11474j = Character.toLowerCase(c5);
        this.f11475k = KeyEvent.normalizeMetaState(i7);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f11477m = 0;
        this.f11476l = drawable;
        this.f11486w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c5, int i7) {
        if (this.f11472h == c5 && this.f11473i == i7) {
            return this;
        }
        this.f11472h = c5;
        this.f11473i = KeyEvent.normalizeMetaState(i7);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c5, char c6, int i7, int i8) {
        this.f11472h = c5;
        this.f11473i = KeyEvent.normalizeMetaState(i7);
        this.f11474j = Character.toLowerCase(c6);
        this.f11475k = KeyEvent.normalizeMetaState(i8);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11470e = charSequence;
        this.n.o(false);
        t tVar = this.f11478o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f11489z = view;
        if (view != null && view.getId() == -1 && (i7 = this.f11467a) > 0) {
            view.setId(i7);
        }
        j jVar = this.n;
        jVar.f11456k = true;
        jVar.o(true);
        return this;
    }
}
