package n1;

import android.content.DialogInterface;
import com.boxhdo.android.tv.ui.activity.main.TvActivity;
/* loaded from: classes.dex */
public final class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TvActivity f12638a;

    public k(TvActivity tvActivity) {
        this.f12638a = tvActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f12638a.finish();
    }
}
