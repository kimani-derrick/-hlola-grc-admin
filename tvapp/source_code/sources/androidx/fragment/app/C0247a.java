package androidx.fragment.app;

import android.util.Log;
import d0.AbstractC0551d;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247a implements N {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5980a;

    /* renamed from: b  reason: collision with root package name */
    public int f5981b;

    /* renamed from: c  reason: collision with root package name */
    public int f5982c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f5983e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5984g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5985h;

    /* renamed from: i  reason: collision with root package name */
    public String f5986i;

    /* renamed from: j  reason: collision with root package name */
    public int f5987j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f5988k;

    /* renamed from: l  reason: collision with root package name */
    public int f5989l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f5990m;
    public ArrayList n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f5991o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5992p;

    /* renamed from: q  reason: collision with root package name */
    public final S f5993q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5994r;

    /* renamed from: s  reason: collision with root package name */
    public int f5995s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5996t;

    public C0247a() {
        this.f5980a = new ArrayList();
        this.f5985h = true;
        this.f5992p = false;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f5984g) {
            this.f5993q.d.add(this);
            return true;
        }
        return true;
    }

    public final void b(a0 a0Var) {
        this.f5980a.add(a0Var);
        a0Var.d = this.f5981b;
        a0Var.f6000e = this.f5982c;
        a0Var.f = this.d;
        a0Var.f6001g = this.f5983e;
    }

    public final void c(String str) {
        if (this.f5985h) {
            this.f5984g = true;
            this.f5986i = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void d(int i7) {
        a0 a0Var;
        if (!this.f5984g) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
        }
        ArrayList arrayList = this.f5980a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ComponentCallbacksC0269x componentCallbacksC0269x = ((a0) arrayList.get(i8)).f5998b;
            if (componentCallbacksC0269x != null) {
                componentCallbacksC0269x.f6105I += i7;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Bump nesting of " + a0Var.f5998b + " to " + a0Var.f5998b.f6105I);
                }
            }
        }
    }

    public final int e(boolean z7) {
        int i7;
        if (!this.f5994r) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new c0());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.f5994r = true;
            boolean z8 = this.f5984g;
            S s6 = this.f5993q;
            if (z8) {
                i7 = s6.f5930j.getAndIncrement();
            } else {
                i7 = -1;
            }
            this.f5995s = i7;
            s6.y(this, z7);
            return this.f5995s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f(int i7, ComponentCallbacksC0269x componentCallbacksC0269x, String str, int i8) {
        String str2 = componentCallbacksC0269x.f6124c0;
        if (str2 != null) {
            AbstractC0551d.c(componentCallbacksC0269x, str2);
        }
        Class<?> cls = componentCallbacksC0269x.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = componentCallbacksC0269x.f6112P;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0269x + ": was " + componentCallbacksC0269x.f6112P + " now " + str);
                }
                componentCallbacksC0269x.f6112P = str;
            }
            if (i7 != 0) {
                if (i7 != -1) {
                    int i9 = componentCallbacksC0269x.f6110N;
                    if (i9 != 0 && i9 != i7) {
                        throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0269x + ": was " + componentCallbacksC0269x.f6110N + " now " + i7);
                    }
                    componentCallbacksC0269x.f6110N = i7;
                    componentCallbacksC0269x.f6111O = i7;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC0269x + " with tag " + str + " to container view with no id");
                }
            }
            b(new a0(i8, componentCallbacksC0269x));
            componentCallbacksC0269x.f6106J = this.f5993q;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5986i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5995s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5994r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f5981b != 0 || this.f5982c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5981b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5982c));
            }
            if (this.d != 0 || this.f5983e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5983e));
            }
            if (this.f5987j != 0 || this.f5988k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5987j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5988k);
            }
            if (this.f5989l != 0 || this.f5990m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5989l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5990m);
            }
        }
        ArrayList arrayList = this.f5980a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a0 a0Var = (a0) arrayList.get(i7);
            switch (a0Var.f5997a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + a0Var.f5997a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(a0Var.f5998b);
            if (z7) {
                if (a0Var.d != 0 || a0Var.f6000e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(a0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(a0Var.f6000e));
                }
                if (a0Var.f != 0 || a0Var.f6001g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(a0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(a0Var.f6001g));
                }
            }
        }
    }

    public final void h(int i7, ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (i7 != 0) {
            f(i7, componentCallbacksC0269x, null, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void i(ComponentCallbacksC0269x componentCallbacksC0269x) {
        S s6;
        if (componentCallbacksC0269x != null && (s6 = componentCallbacksC0269x.f6106J) != null && s6 != this.f5993q) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC0269x.toString() + " is already attached to a FragmentManager.");
        }
        b(new a0(8, componentCallbacksC0269x));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5995s >= 0) {
            sb.append(" #");
            sb.append(this.f5995s);
        }
        if (this.f5986i != null) {
            sb.append(" ");
            sb.append(this.f5986i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.a0, java.lang.Object] */
    public C0247a(C0247a c0247a) {
        this();
        c0247a.f5993q.K();
        C0271z c0271z = c0247a.f5993q.f5941v;
        if (c0271z != null) {
            c0271z.f6147s.getClassLoader();
        }
        Iterator it = c0247a.f5980a.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            ArrayList arrayList = this.f5980a;
            ?? obj = new Object();
            obj.f5997a = a0Var.f5997a;
            obj.f5998b = a0Var.f5998b;
            obj.f5999c = a0Var.f5999c;
            obj.d = a0Var.d;
            obj.f6000e = a0Var.f6000e;
            obj.f = a0Var.f;
            obj.f6001g = a0Var.f6001g;
            obj.f6002h = a0Var.f6002h;
            obj.f6003i = a0Var.f6003i;
            arrayList.add(obj);
        }
        this.f5981b = c0247a.f5981b;
        this.f5982c = c0247a.f5982c;
        this.d = c0247a.d;
        this.f5983e = c0247a.f5983e;
        this.f = c0247a.f;
        this.f5984g = c0247a.f5984g;
        this.f5985h = c0247a.f5985h;
        this.f5986i = c0247a.f5986i;
        this.f5989l = c0247a.f5989l;
        this.f5990m = c0247a.f5990m;
        this.f5987j = c0247a.f5987j;
        this.f5988k = c0247a.f5988k;
        if (c0247a.n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.n = arrayList2;
            arrayList2.addAll(c0247a.n);
        }
        if (c0247a.f5991o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f5991o = arrayList3;
            arrayList3.addAll(c0247a.f5991o);
        }
        this.f5992p = c0247a.f5992p;
        this.f5995s = -1;
        this.f5996t = false;
        this.f5993q = c0247a.f5993q;
        this.f5994r = c0247a.f5994r;
        this.f5995s = c0247a.f5995s;
        this.f5996t = c0247a.f5996t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0247a(S s6) {
        this();
        s6.K();
        C0271z c0271z = s6.f5941v;
        if (c0271z != null) {
            c0271z.f6147s.getClassLoader();
        }
        this.f5995s = -1;
        this.f5996t = false;
        this.f5993q = s6;
    }
}
