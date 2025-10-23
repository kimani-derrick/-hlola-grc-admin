package j;

import K.Q;
import K.T;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class j implements Menu {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f11447u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f11448a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f11449b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11450c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public h f11451e;
    public final ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f11452g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11453h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f11454i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f11455j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11456k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f11457l;

    /* renamed from: s  reason: collision with root package name */
    public k f11463s;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11458m = false;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f11459o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11460p = false;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f11461q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f11462r = new CopyOnWriteArrayList();

    /* renamed from: t  reason: collision with root package name */
    public boolean f11464t = false;

    public j(Context context) {
        Resources resources;
        int identifier;
        boolean z7 = false;
        this.f11448a = context;
        Resources resources2 = context.getResources();
        this.f11449b = resources2;
        this.f = new ArrayList();
        this.f11452g = new ArrayList();
        this.f11453h = true;
        this.f11454i = new ArrayList();
        this.f11455j = new ArrayList();
        this.f11456k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = T.f1451a;
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : Q.b(viewConfiguration)) {
                z7 = true;
            }
        }
        this.d = z7;
    }

    public final k a(int i7, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 >= 0 && i11 < 6) {
            int i12 = (f11447u[i11] << 16) | (65535 & i9);
            k kVar = new k(this, i7, i8, i9, i12, charSequence);
            ArrayList arrayList = this.f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((k) arrayList.get(size)).d <= i12) {
                        i10 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i10 = 0;
                    break;
                }
            }
            arrayList.add(i10, kVar);
            o(true);
            return kVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f11449b.getString(i7));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        Intent intent2;
        int i12;
        PackageManager packageManager = this.f11448a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i11 = queryIntentActivityOptions.size();
        } else {
            i11 = 0;
        }
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            if (i14 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i14];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k a7 = a(i7, i8, i9, resolveInfo.loadLabel(packageManager));
            a7.setIcon(resolveInfo.loadIcon(packageManager));
            a7.f11471g = intent3;
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = a7;
            }
        }
        return i11;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f11449b.getString(i7));
    }

    public final void b(p pVar, Context context) {
        this.f11462r.add(new WeakReference(pVar));
        pVar.a(context, this);
        this.f11456k = true;
    }

    public final void c(boolean z7) {
        if (this.f11460p) {
            return;
        }
        this.f11460p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11462r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.b(this, z7);
            }
        }
        this.f11460p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f11463s;
        if (kVar != null) {
            d(kVar);
        }
        this.f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f11457l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11462r;
        boolean z7 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f11463s == kVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z7 = pVar.g(kVar);
                    if (z7) {
                        break;
                    }
                }
            }
            r();
            if (z7) {
                this.f11463s = null;
            }
        }
        return z7;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        h hVar = this.f11451e;
        if (hVar != null && hVar.m(menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11462r;
        boolean z7 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z7 = pVar.e(kVar);
                if (z7) {
                    break;
                }
            }
        }
        r();
        if (z7) {
            this.f11463s = kVar;
        }
        return z7;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = (k) arrayList.get(i8);
            if (kVar.f11467a == i7) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.f11478o.findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final k g(int i7, KeyEvent keyEvent) {
        char c5;
        ArrayList arrayList = this.f11461q;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean m7 = m();
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = (k) arrayList.get(i8);
            if (m7) {
                c5 = kVar.f11474j;
            } else {
                c5 = kVar.f11472h;
            }
            char[] cArr = keyData.meta;
            if ((c5 == cArr[0] && (metaState & 2) == 0) || ((c5 == cArr[2] && (metaState & 2) != 0) || (m7 && c5 == '\b' && i7 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f.get(i7);
    }

    public final void h(ArrayList arrayList, int i7, KeyEvent keyEvent) {
        char c5;
        int i8;
        boolean m7 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i7 != 67) {
            return;
        }
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            k kVar = (k) arrayList2.get(i9);
            if (kVar.hasSubMenu()) {
                kVar.f11478o.h(arrayList, i7, keyEvent);
            }
            if (m7) {
                c5 = kVar.f11474j;
            } else {
                c5 = kVar.f11472h;
            }
            if (m7) {
                i8 = kVar.f11475k;
            } else {
                i8 = kVar.f11473i;
            }
            if ((modifiers & 69647) == (i8 & 69647) && c5 != 0) {
                char[] cArr = keyData.meta;
                if (c5 != cArr[0] && c5 != cArr[2]) {
                    if (m7 && c5 == '\b') {
                        if (i7 != 67) {
                        }
                    }
                }
                if (kVar.isEnabled()) {
                    arrayList.add(kVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((k) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k5 = k();
        if (!this.f11456k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11462r;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z7 |= pVar.d();
            }
        }
        ArrayList arrayList = this.f11454i;
        ArrayList arrayList2 = this.f11455j;
        arrayList.clear();
        arrayList2.clear();
        if (z7) {
            int size = k5.size();
            for (int i7 = 0; i7 < size; i7++) {
                k kVar = (k) k5.get(i7);
                if (kVar.d()) {
                    arrayList.add(kVar);
                } else {
                    arrayList2.add(kVar);
                }
            }
        } else {
            arrayList2.addAll(k());
        }
        this.f11456k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        if (g(i7, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final ArrayList k() {
        boolean z7 = this.f11453h;
        ArrayList arrayList = this.f11452g;
        if (!z7) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            k kVar = (k) arrayList2.get(i7);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f11453h = false;
        this.f11456k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f11464t;
    }

    public boolean m() {
        return this.f11450c;
    }

    public boolean n() {
        return this.d;
    }

    public final void o(boolean z7) {
        if (!this.f11458m) {
            if (z7) {
                this.f11453h = true;
                this.f11456k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f11462r;
            if (!copyOnWriteArrayList.isEmpty()) {
                s();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        pVar.f();
                    }
                }
                r();
                return;
            }
            return;
        }
        this.n = true;
        if (z7) {
            this.f11459o = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
        if ((r8 & 1) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MenuItem r6, j.p r7, int r8) {
        /*
            r5 = this;
            j.k r6 = (j.k) r6
            r0 = 0
            if (r6 == 0) goto La6
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto La6
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f11479p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L36
        L1a:
            j.j r1 = r6.n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.f11471g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f11448a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = r0
        L36:
            boolean r3 = r6.c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto La5
        L43:
            r5.c(r2)
            goto La5
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L52
            r6 = r8 & 1
            if (r6 != 0) goto La5
            goto L43
        L52:
            r8 = r8 & 4
            if (r8 != 0) goto L59
            r5.c(r0)
        L59:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L6d
            j.t r8 = new j.t
            android.content.Context r3 = r5.f11448a
            r8.<init>(r3, r5, r6)
            r6.f11478o = r8
            java.lang.CharSequence r3 = r6.f11470e
            r8.setHeaderTitle(r3)
        L6d:
            j.t r6 = r6.f11478o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f11462r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L78
            goto La1
        L78:
            if (r7 == 0) goto L7e
            boolean r0 = r7.k(r6)
        L7e:
            java.util.Iterator r7 = r8.iterator()
        L82:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La1
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            j.p r4 = (j.p) r4
            if (r4 != 0) goto L9a
            r8.remove(r3)
            goto L82
        L9a:
            if (r0 != 0) goto L82
            boolean r0 = r4.k(r6)
            goto L82
        La1:
            r1 = r1 | r0
            if (r1 != 0) goto La5
            goto L43
        La5:
            return r1
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.j.p(android.view.MenuItem, j.p, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return p(findItem(i7), null, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        boolean z7;
        k g7 = g(i7, keyEvent);
        if (g7 != null) {
            z7 = p(g7, null, i8);
        } else {
            z7 = false;
        }
        if ((i8 & 2) != 0) {
            c(true);
        }
        return z7;
    }

    public final void q(int i7, CharSequence charSequence, int i8, View view) {
        if (view != null) {
            this.f11457l = null;
        } else {
            if (i7 > 0) {
                this.f11457l = this.f11449b.getText(i7);
            } else if (charSequence != null) {
                this.f11457l = charSequence;
            }
            if (i8 > 0) {
                A.a.b(this.f11448a, i8);
            }
        }
        o(false);
    }

    public final void r() {
        this.f11458m = false;
        if (this.n) {
            this.n = false;
            o(this.f11459o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (((k) arrayList.get(i9)).f11468b == i7) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((k) arrayList.get(i9)).f11468b != i7) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i9 < arrayList2.size()) {
                        arrayList2.remove(i9);
                    }
                }
                i8 = i10;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (((k) arrayList.get(i8)).f11467a == i7) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i8 < arrayList2.size()) {
                arrayList2.remove(i8);
                o(true);
            }
        }
    }

    public final void s() {
        if (!this.f11458m) {
            this.f11458m = true;
            this.n = false;
            this.f11459o = false;
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z7, boolean z8) {
        int i8;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            k kVar = (k) arrayList.get(i9);
            if (kVar.f11468b == i7) {
                int i10 = kVar.f11487x & (-5);
                if (z8) {
                    i8 = 4;
                } else {
                    i8 = 0;
                }
                kVar.f11487x = i10 | i8;
                kVar.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f11464t = z7;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z7) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = (k) arrayList.get(i8);
            if (kVar.f11468b == i7) {
                kVar.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z7) {
        int i8;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            k kVar = (k) arrayList.get(i9);
            if (kVar.f11468b == i7) {
                int i10 = kVar.f11487x;
                int i11 = i10 & (-9);
                if (z7) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                int i12 = i11 | i8;
                kVar.f11487x = i12;
                if (i10 != i12) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f11450c = z7;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f11449b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f11449b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        k a7 = a(i7, i8, i9, charSequence);
        t tVar = new t(this.f11448a, this, a7);
        a7.f11478o = tVar;
        tVar.setHeaderTitle(a7.f11470e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public j j() {
        return this;
    }
}
