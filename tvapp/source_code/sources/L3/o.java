package L3;

import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public final class o implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f2083a;

    public o(q qVar) {
        this.f2083a = qVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        q qVar = this.f2083a;
        qVar.f2089i = true;
        qVar.f2091k = System.currentTimeMillis();
        qVar.g(false);
    }
}
