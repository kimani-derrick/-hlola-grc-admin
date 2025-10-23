package w0;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c0 extends M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15516a;

    public c0(RecyclerView recyclerView) {
        this.f15516a = recyclerView;
    }

    @Override // w0.M
    public final void a() {
        RecyclerView recyclerView = this.f15516a;
        recyclerView.j(null);
        recyclerView.f6959x0.f = true;
        recyclerView.b0(true);
        if (!recyclerView.f6952u.k()) {
            recyclerView.requestLayout();
        }
    }

    @Override // w0.M
    public final void b(int i7, int i8, Object obj) {
        RecyclerView recyclerView = this.f15516a;
        recyclerView.j(null);
        com.google.android.material.datepicker.c cVar = recyclerView.f6952u;
        if (i8 < 1) {
            cVar.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) cVar.f8852c;
        arrayList.add(cVar.m(obj, 4, i7, i8));
        cVar.f8850a |= 4;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // w0.M
    public final void c(int i7, int i8) {
        RecyclerView recyclerView = this.f15516a;
        recyclerView.j(null);
        com.google.android.material.datepicker.c cVar = recyclerView.f6952u;
        if (i8 < 1) {
            cVar.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) cVar.f8852c;
        arrayList.add(cVar.m(null, 1, i7, i8));
        cVar.f8850a |= 1;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // w0.M
    public final void d(int i7, int i8) {
        RecyclerView recyclerView = this.f15516a;
        recyclerView.j(null);
        com.google.android.material.datepicker.c cVar = recyclerView.f6952u;
        cVar.getClass();
        if (i7 != i8) {
            ArrayList arrayList = (ArrayList) cVar.f8852c;
            arrayList.add(cVar.m(null, 8, i7, i8));
            cVar.f8850a |= 8;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }

    @Override // w0.M
    public final void e(int i7, int i8) {
        RecyclerView recyclerView = this.f15516a;
        recyclerView.j(null);
        com.google.android.material.datepicker.c cVar = recyclerView.f6952u;
        if (i8 < 1) {
            cVar.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) cVar.f8852c;
        arrayList.add(cVar.m(null, 2, i7, i8));
        cVar.f8850a |= 2;
        if (arrayList.size() == 1) {
            f();
        }
    }

    public final void f() {
        boolean z7 = RecyclerView.f6884Y0;
        RecyclerView recyclerView = this.f15516a;
        if (z7 && recyclerView.f6907K && recyclerView.f6905J) {
            Field field = K.O.f1447a;
            recyclerView.postOnAnimation(recyclerView.f6960y);
            return;
        }
        recyclerView.f6921R = true;
        recyclerView.requestLayout();
    }
}
