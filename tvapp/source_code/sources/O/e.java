package O;

import H2.U;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
/* loaded from: classes.dex */
public final class e extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U f2545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputConnection inputConnection, U u7) {
        super(inputConnection, false);
        this.f2545a = u7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z7;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        U u7 = this.f2545a;
        if (bundle != null) {
            int i7 = 0;
            i7 = 0;
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z7 = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z7 = true;
            }
            if (z7) {
                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            } else {
                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            try {
                ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(str2);
                if (z7) {
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
                try {
                    Uri uri = (Uri) bundle.getParcelable(str3);
                    if (z7) {
                        str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    } else {
                        str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    }
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                    if (z7) {
                        str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    } else {
                        str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    }
                    Uri uri2 = (Uri) bundle.getParcelable(str5);
                    if (z7) {
                        str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    } else {
                        str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    }
                    int i8 = bundle.getInt(str6);
                    if (z7) {
                        str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    } else {
                        str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    }
                    Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                    if (uri != null && clipDescription != null) {
                        i7 = u7.g(new T4.c(uri, clipDescription, uri2), i8, bundle2);
                    }
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(i7, null);
                    }
                    if (i7 != 0) {
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    resultReceiver = resultReceiver2;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        return super.performPrivateCommand(str, bundle);
    }
}
