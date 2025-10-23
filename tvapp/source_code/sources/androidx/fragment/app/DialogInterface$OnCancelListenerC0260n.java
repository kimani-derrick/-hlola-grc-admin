package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
/* renamed from: androidx.fragment.app.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnCancelListenerC0260n implements DialogInterface.OnCancelListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0263q f6062q;

    public DialogInterface$OnCancelListenerC0260n(DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q) {
        this.f6062q = dialogInterface$OnCancelListenerC0263q;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface$OnCancelListenerC0263q dialogInterface$OnCancelListenerC0263q = this.f6062q;
        Dialog dialog = dialogInterface$OnCancelListenerC0263q.y0;
        if (dialog != null) {
            dialogInterface$OnCancelListenerC0263q.onCancel(dialog);
        }
    }
}
