package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
/* renamed from: androidx.fragment.app.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnDismissListenerC0261o implements DialogInterface.OnDismissListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0263q f6063q;

    public DialogInterface$OnDismissListenerC0261o(DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q) {
        this.f6063q = dialogInterface$OnCancelListenerC0263q;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q = this.f6063q;
        Dialog dialog = dialogInterface$OnCancelListenerC0263q.y0;
        if (dialog != null) {
            dialogInterface$OnCancelListenerC0263q.onDismiss(dialog);
        }
    }
}
