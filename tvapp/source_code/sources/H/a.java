package H;

import androidx.leanback.widget.SearchBar;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f769q;

    /* renamed from: r  reason: collision with root package name */
    public final int f770r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f771s;

    public /* synthetic */ a(int i7, int i8, Object obj) {
        this.f769q = i8;
        this.f771s = obj;
        this.f770r = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f769q) {
            case 0:
                C.b bVar = (C.b) ((T4.c) this.f771s).f3382r;
                if (bVar != null) {
                    bVar.h(this.f770r);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f771s;
                int size = arrayList.size();
                int i7 = 0;
                if (this.f770r != 1) {
                    while (i7 < size) {
                        ((androidx.emoji2.text.h) arrayList.get(i7)).getClass();
                        i7++;
                    }
                    return;
                }
                while (i7 < size) {
                    ((androidx.emoji2.text.h) arrayList.get(i7)).a();
                    i7++;
                }
                return;
            case 2:
                SearchBar searchBar = (SearchBar) this.f771s;
                searchBar.f6499J.play(searchBar.f6500K.get(this.f770r), 1.0f, 1.0f, 1, 0, 1.0f);
                return;
            default:
                ((com.google.android.material.datepicker.j) this.f771s).f8873u0.o0(this.f770r);
                return;
        }
    }

    public a(List list, int i7, Throwable th) {
        this.f769q = 1;
        android.support.v4.media.session.b.j(list, "initCallbacks cannot be null");
        this.f771s = new ArrayList(list);
        this.f770r = i7;
    }
}
