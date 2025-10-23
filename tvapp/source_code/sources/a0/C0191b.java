package a0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import java.nio.ByteBuffer;
/* renamed from: a0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4962a;

    /* renamed from: b  reason: collision with root package name */
    public final J3.e f4963b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i7;
        J3.e eVar = new J3.e(15);
        this.f4962a = editText;
        this.f4963b = eVar;
        if (androidx.emoji2.text.j.f5841j != null) {
            androidx.emoji2.text.j a7 = androidx.emoji2.text.j.a();
            if (a7.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                androidx.emoji2.text.e eVar2 = a7.f5845e;
                eVar2.getClass();
                Bundle bundle = editorInfo.extras;
                Z.b bVar = (Z.b) ((C4.b) eVar2.f5835b).f421r;
                int a8 = bVar.a(4);
                if (a8 != 0) {
                    i7 = ((ByteBuffer) bVar.f295t).getInt(a8 + bVar.f292q);
                } else {
                    i7 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i7);
                Bundle bundle2 = editorInfo.extras;
                ((androidx.emoji2.text.j) eVar2.f5836c).getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        Editable editableText = this.f4962a.getEditableText();
        this.f4963b.getClass();
        if (!J3.e.y(this, editableText, i7, i8, false) && !super.deleteSurroundingText(i7, i8)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        Editable editableText = this.f4962a.getEditableText();
        this.f4963b.getClass();
        if (J3.e.y(this, editableText, i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8)) {
            return true;
        }
        return false;
    }
}
