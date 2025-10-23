package i;

import K.AbstractC0036l;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.k;
import java.lang.reflect.Constructor;
import r0.AbstractC1111a;
/* renamed from: i.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765d {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f11280A;

    /* renamed from: D  reason: collision with root package name */
    public final /* synthetic */ C0766e f11283D;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f11284a;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11289h;

    /* renamed from: i  reason: collision with root package name */
    public int f11290i;

    /* renamed from: j  reason: collision with root package name */
    public int f11291j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f11292k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f11293l;

    /* renamed from: m  reason: collision with root package name */
    public int f11294m;
    public char n;

    /* renamed from: o  reason: collision with root package name */
    public int f11295o;

    /* renamed from: p  reason: collision with root package name */
    public char f11296p;

    /* renamed from: q  reason: collision with root package name */
    public int f11297q;

    /* renamed from: r  reason: collision with root package name */
    public int f11298r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11299s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11300t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11301u;

    /* renamed from: v  reason: collision with root package name */
    public int f11302v;

    /* renamed from: w  reason: collision with root package name */
    public int f11303w;

    /* renamed from: x  reason: collision with root package name */
    public String f11304x;

    /* renamed from: y  reason: collision with root package name */
    public String f11305y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f11306z;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f11281B = null;

    /* renamed from: C  reason: collision with root package name */
    public PorterDuff.Mode f11282C = null;

    /* renamed from: b  reason: collision with root package name */
    public int f11285b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f11286c = 0;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f11287e = 0;
    public boolean f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11288g = true;

    public C0765d(C0766e c0766e, Menu menu) {
        this.f11283D = c0766e;
        this.f11284a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f11283D.f11310c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.view.MenuItem$OnMenuItemClickListener, java.lang.Object, i.c] */
    public final void b(MenuItem menuItem) {
        boolean z7;
        MenuItem enabled = menuItem.setChecked(this.f11299s).setVisible(this.f11300t).setEnabled(this.f11301u);
        boolean z8 = false;
        if (this.f11298r >= 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        enabled.setCheckable(z7).setTitleCondensed(this.f11293l).setIcon(this.f11294m);
        int i7 = this.f11302v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        String str = this.f11305y;
        C0766e c0766e = this.f11283D;
        if (str != null) {
            if (!c0766e.f11310c.isRestricted()) {
                if (c0766e.d == null) {
                    c0766e.d = C0766e.a(c0766e.f11310c);
                }
                Object obj = c0766e.d;
                String str2 = this.f11305y;
                ?? obj2 = new Object();
                obj2.f11278a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f11279b = cls.getMethod(str2, MenuItem$OnMenuItemClickListenerC0764c.f11277c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e3) {
                    StringBuilder u7 = AbstractC1111a.u("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    u7.append(cls.getName());
                    InflateException inflateException = new InflateException(u7.toString());
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f11298r >= 2 && (menuItem instanceof k)) {
            k kVar = (k) menuItem;
            kVar.f11487x = (kVar.f11487x & (-5)) | 4;
        }
        String str3 = this.f11304x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0766e.f11307e, c0766e.f11308a));
            z8 = true;
        }
        int i8 = this.f11303w;
        if (i8 > 0) {
            if (!z8) {
                menuItem.setActionView(i8);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        CharSequence charSequence = this.f11306z;
        boolean z9 = menuItem instanceof k;
        if (z9) {
            ((k) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0036l.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f11280A;
        if (z9) {
            ((k) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0036l.m(menuItem, charSequence2);
        }
        char c5 = this.n;
        int i9 = this.f11295o;
        if (z9) {
            ((k) menuItem).setAlphabeticShortcut(c5, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0036l.g(menuItem, c5, i9);
        }
        char c6 = this.f11296p;
        int i10 = this.f11297q;
        if (z9) {
            ((k) menuItem).setNumericShortcut(c6, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0036l.k(menuItem, c6, i10);
        }
        PorterDuff.Mode mode = this.f11282C;
        if (mode != null) {
            if (z9) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0036l.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f11281B;
        if (colorStateList != null) {
            if (z9) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0036l.i(menuItem, colorStateList);
            }
        }
    }
}
