
                var index = fields.indexOf(field);

                if (index >= 0) { // found
                    var msgs = [];
                    msgs = scopeErrors[field];
                    msgs.push(data.messages[idx]);
                    scopeErrors[field] = msgs;

                } else {    // fresh message
                    scopeErrors[field] = [data.messages[idx]];
                    fields.push(field);
                }
            }
        }catch (err) {}
        return scopeErrors;
    }
});