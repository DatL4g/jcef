namespace cpp thrift_codegen
namespace java com.jetbrains.cef.remote.thrift_codegen

struct RObject {
    1: required i32 objId,
    2: optional bool isPersistent,
    3: optional bool isDisableDefaultHandling,
    4: optional map<string, string> objInfo,
}

struct PostDataElement {
    1: required bool isReadOnly,
    2: optional string file,
    3: optional binary bytes,
}

struct PostData {
    1: required bool isReadOnly,
    2: required bool hasExcludedElements,
    3: optional list<PostDataElement> elements,
}

struct KeyEvent {
    1: required string type,
    2: required i32 modifiers,
    3: required i32 windows_key_code,
    4: required i32 native_key_code,
    5: required bool is_system_key,
    6: required i16 character,
    7: required i16 unmodified_character,
    8: required bool focus_on_editable_field
}
