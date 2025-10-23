package androidx.leanback.widget;

import android.database.Observable;
/* loaded from: classes.dex */
public final class O extends Observable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6436a;

    public /* synthetic */ O(int i7) {
        this.f6436a = i7;
    }

    public boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        switch (this.f6436a) {
            case 0:
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((androidx.leanback.app.z) ((Observable) this).mObservers.get(size)).a();
                }
                return;
            default:
                for (int size2 = ((Observable) this).mObservers.size() - 1; size2 >= 0; size2--) {
                    ((w0.M) ((Observable) this).mObservers.get(size2)).a();
                }
                return;
        }
    }

    public void c(int i7, int i8) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((w0.M) ((Observable) this).mObservers.get(size)).d(i7, i8);
        }
    }

    public void d(int i7, int i8) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((androidx.leanback.app.z) ((Observable) this).mObservers.get(size)).c(i7, i8);
        }
    }

    public void e(int i7, int i8, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((w0.M) ((Observable) this).mObservers.get(size)).b(i7, i8, obj);
        }
    }

    public final void f(int i7, int i8) {
        switch (this.f6436a) {
            case 0:
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((androidx.leanback.app.z) ((Observable) this).mObservers.get(size)).e(i7, i8);
                }
                return;
            default:
                for (int size2 = ((Observable) this).mObservers.size() - 1; size2 >= 0; size2--) {
                    ((w0.M) ((Observable) this).mObservers.get(size2)).c(i7, i8);
                }
                return;
        }
    }

    public final void g(int i7, int i8) {
        switch (this.f6436a) {
            case 0:
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((androidx.leanback.app.z) ((Observable) this).mObservers.get(size)).g(i7, i8);
                }
                return;
            default:
                for (int size2 = ((Observable) this).mObservers.size() - 1; size2 >= 0; size2--) {
                    ((w0.M) ((Observable) this).mObservers.get(size2)).e(i7, i8);
                }
                return;
        }
    }
}
