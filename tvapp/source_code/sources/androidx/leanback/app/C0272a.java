package androidx.leanback.app;

import X2.RunnableC0120b;
import androidx.leanback.widget.AbstractC0292g;
import androidx.leanback.widget.T;
import androidx.leanback.widget.picker.DatePicker;
import j0.AbstractC0781c;
import j0.C0779a;
import j0.C0782d;
import java.util.ArrayList;
import java.util.Calendar;
import w0.k0;
/* renamed from: androidx.leanback.app.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272a extends T {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6193b;

    public /* synthetic */ C0272a(int i7, Object obj) {
        this.f6192a = i7;
        this.f6193b = obj;
    }

    @Override // androidx.leanback.widget.T
    public final void a(AbstractC0292g abstractC0292g, k0 k0Var, int i7, int i8) {
        C0782d c0782d;
        Calendar calendar;
        Calendar calendar2;
        switch (this.f6192a) {
            case 0:
                AbstractC0274c abstractC0274c = (AbstractC0274c) this.f6193b;
                if (!abstractC0274c.f6202t0.f6194a) {
                    abstractC0274c.f6200r0 = i7;
                    abstractC0274c.h0(k0Var, i7, i8);
                    return;
                }
                return;
            default:
                C0779a c0779a = (C0779a) abstractC0292g.getAdapter();
                AbstractC0781c abstractC0781c = (AbstractC0781c) this.f6193b;
                int indexOf = abstractC0781c.f11523r.indexOf(abstractC0292g);
                abstractC0781c.d(indexOf);
                if (k0Var != null) {
                    int i9 = ((C0782d) abstractC0781c.f11524s.get(indexOf)).f11533b + i7;
                    DatePicker datePicker = (DatePicker) abstractC0781c;
                    datePicker.f6637R.setTimeInMillis(datePicker.f6636Q.getTimeInMillis());
                    ArrayList arrayList = datePicker.f11524s;
                    if (arrayList == null) {
                        c0782d = null;
                    } else {
                        c0782d = (C0782d) arrayList.get(indexOf);
                    }
                    int i10 = c0782d.f11532a;
                    if (indexOf == datePicker.f6630K) {
                        datePicker.f6637R.add(5, i9 - i10);
                    } else if (indexOf == datePicker.f6629J) {
                        datePicker.f6637R.add(2, i9 - i10);
                    } else if (indexOf == datePicker.f6631L) {
                        datePicker.f6637R.add(1, i9 - i10);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    datePicker.f6636Q.set(datePicker.f6637R.get(1), datePicker.f6637R.get(2), datePicker.f6637R.get(5));
                    if (datePicker.f6636Q.before(datePicker.f6634O)) {
                        calendar = datePicker.f6636Q;
                        calendar2 = datePicker.f6634O;
                    } else {
                        if (datePicker.f6636Q.after(datePicker.f6635P)) {
                            calendar = datePicker.f6636Q;
                            calendar2 = datePicker.f6635P;
                        }
                        datePicker.post(new RunnableC0120b(datePicker));
                        return;
                    }
                    calendar.setTimeInMillis(calendar2.getTimeInMillis());
                    datePicker.post(new RunnableC0120b(datePicker));
                    return;
                }
                return;
        }
    }
}
