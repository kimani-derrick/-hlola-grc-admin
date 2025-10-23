package s3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public final class P extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final q1 f13851a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13852b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13853c;

    public P(q1 q1Var) {
        this.f13851a = q1Var;
    }

    public final void a() {
        q1 q1Var = this.f13851a;
        q1Var.b0();
        q1Var.d().D();
        q1Var.d().D();
        if (!this.f13852b) {
            return;
        }
        q1Var.b().f13803D.d("Unregistering connectivity change receiver");
        this.f13852b = false;
        this.f13853c = false;
        try {
            q1Var.f14185B.f14056q.unregisterReceiver(this);
        } catch (IllegalArgumentException e3) {
            q1Var.b().f13807v.c(e3, "Failed to unregister the network broadcast receiver");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q1 q1Var = this.f13851a;
        q1Var.b0();
        String action = intent.getAction();
        q1Var.b().f13803D.c(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C1160O c1160o = q1Var.f14206r;
            q1.z(c1160o);
            boolean r02 = c1160o.r0();
            if (this.f13853c != r02) {
                this.f13853c = r02;
                q1Var.d().M(new P.b(this, r02));
                return;
            }
            return;
        }
        q1Var.b().f13810y.c(action, "NetworkBroadcastReceiver received unknown action");
    }
}
